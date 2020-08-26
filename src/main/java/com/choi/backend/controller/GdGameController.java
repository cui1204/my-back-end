package com.choi.backend.controller;

import com.choi.backend.common.api.CommonPage;
import com.choi.backend.common.api.CommonResult;
import com.choi.backend.mbg.model.*;
import com.choi.backend.service.GdGameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "GdGameController", description = "游戏管理")
@RequestMapping("/game")
public class GdGameController {
    @Autowired
    private GdGameService gdGameService;

    @ApiOperation(value = "获取用户信息")
    @RequestMapping(value = "/userinfo/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getUserInfo(@PathVariable String username) {
//        String username = principal.getName();
        GdUser gdUser = gdGameService.getByUsername(username);
        Map<String, Object> data = new HashMap<>();
        data.put("userId", gdUser.getUserId());
        data.put("username", gdUser.getUsername());
        data.put("icon", gdUser.getIcon());

        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取player数据")
    @RequestMapping(value = "/player/{player_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getPlayer(@PathVariable int player_id) {
        GdPlayer gdPlayer = gdGameService.getPlayerById(player_id);
        Map<String, Object> data = new HashMap<>();
        data.put("playerId", gdPlayer.getPlayerId());
        data.put("name", gdPlayer.getName());
        data.put("resName", gdPlayer.getResName());
        data.put("resNameGun", gdPlayer.getResNameGun());
        data.put("hp", gdPlayer.getHp());
        data.put("atk", gdPlayer.getAtk());
        data.put("def", gdPlayer.getDef());
        data.put("critical", gdPlayer.getCritical());
        data.put("atkSpeed", gdPlayer.getAtkSpeed());

        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取dungeon数据")
    @RequestMapping(value = "/dungeon/{dungeon_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getDungeon(@PathVariable int dungeon_id) {
        GdDungeon gdDungeon = gdGameService.getDungeonById(dungeon_id);
        Map<String, Object> data = new HashMap<>();
        data.put("dungeonId", gdDungeon.getDungeonId());
        data.put("name", gdDungeon.getName());
        data.put("resNameTop", gdDungeon.getResNameTop());
        data.put("resNameBottom", gdDungeon.getResNameBottom());
        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取level数据")
    @RequestMapping(value = "/level/{dungeon_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getLevel(@PathVariable int dungeon_id) {
        List<GdLevel> list = gdGameService.getLevelListByDungeonId(dungeon_id);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取monster数据")
    @RequestMapping(value = "/monster/{monster_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getMonster(@PathVariable int monster_id) {
        GdMonster gdMonster = gdGameService.getMonsterById(monster_id);
        Map<String, Object> data = new HashMap<>();
        data.put("monsterId", gdMonster.getMonsterId());
        data.put("name", gdMonster.getName());
        data.put("type", gdMonster.getType());
        data.put("resName", gdMonster.getResName());

        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取monster list数据")
    @RequestMapping(value = "/monsters/{dungeon_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getMonsters(@PathVariable int dungeon_id) {
        List<GdMonster> list = gdGameService.getMonsterListByDungeonId(dungeon_id);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取monsterlevel数据")
    @RequestMapping(value = "/monsterlevel/{monster_level_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getMonsterLevel(@PathVariable int monster_level_id) {
        GdMonsterLevel gdMonsterLevel = gdGameService.getMonsterLevelById(monster_level_id);
        Map<String, Object> data = new HashMap<>();
        data.put("monsterLevelId", gdMonsterLevel.getMonsterLevelId());
        data.put("level", gdMonsterLevel.getLevel());
        data.put("hp", gdMonsterLevel.getHp());
        data.put("def", gdMonsterLevel.getDef());

        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取monsterlevel list数据")
    @RequestMapping(value = "/monsterlevels", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getMonsterLevels() {
        List<GdMonsterLevel> list = gdGameService.getMonsterLevelList();
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取drop数据")
    @RequestMapping(value = "/drop/{drop_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getDrop(@PathVariable int drop_id) {
        GdDrop gdDrop = gdGameService.getDropById(drop_id);
        Map<String, Object> data = buildItemArray(gdDrop);
        return CommonResult.success(data);
    }

    /**
     * 将多个item字段构建为items数组
     *
     * @param gdDrop
     * @return
     */
    private Map<String, Object> buildItemArray(GdDrop gdDrop) {
        Map<String, Object> data = new HashMap<>();
        data.put("dropId", gdDrop.getDropId());
        data.put("type", gdDrop.getType());

        List<Map> items = new ArrayList<>();


        Map<String, Integer> items1 = new HashMap<>();
        items1.put("itemId", gdDrop.getItem1());
        items1.put("itemValue", gdDrop.getItemValue1());
        items.add(items1);


        Map<String, Integer> items2 = new HashMap<>();
        items2.put("itemId", gdDrop.getItem2());
        items2.put("itemValue", gdDrop.getItemValue2());
        items.add(items2);

        Map<String, Integer> items3 = new HashMap<>();
        items3.put("itemId", gdDrop.getItem3());
        items3.put("itemValue", gdDrop.getItemValue3());
        items.add(items3);

        Map<String, Integer> items4 = new HashMap<>();
        items4.put("itemId", gdDrop.getItem4());
        items4.put("itemValue", gdDrop.getItemValue4());
        items.add(items4);

        Map<String, Integer> items5 = new HashMap<>();
        items5.put("itemId", gdDrop.getItem5());
        items5.put("itemValue", gdDrop.getItemValue5());
        items.add(items5);

        Map<String, Integer> items6 = new HashMap<>();
        items6.put("itemId", gdDrop.getItem6());
        items6.put("itemValue", gdDrop.getItemValue6());
        items.add(items6);

        data.put("items", items);

        return data;
    }

    @ApiOperation(value = "获取drop list数据")
    @RequestMapping(value = "/drops/{dungeon_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getDrops(@PathVariable int dungeon_id) {
        List<GdDrop> list = gdGameService.getDropListByDungeonId(dungeon_id);
        List<Map<String, Object>> dropList = new ArrayList<>();
        for (GdDrop gdd : list) {
            Map<String, Object> data = buildItemArray(gdd);
            dropList.add(data);
        }
        return CommonResult.success(CommonPage.restPage(dropList));
    }

    @ApiOperation(value = "获取map数据")
    @RequestMapping(value = "/map/{map_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getMap(@PathVariable int map_id) {
//        GdMap gdMap = gdGameService.getMapByPid(map_id);
//        Map<String, Object> data = new HashMap<>();
//        data.put("monster_id", gdMonster.getMonterId());
//        data.put("name", gdMonster.getName());
//        data.put("type", gdMonster.getType());
//        data.put("res_name", gdMonster.getResName());
//        return CommonResult.success(data);

        List<GdMap> list = gdGameService.getMapListById(map_id);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取item数据")
    @RequestMapping(value = "/item/{item_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getItem(@PathVariable int item_id) {
        GdItems gdItems = gdGameService.getItemById(item_id);
        Map<String, Object> data = new HashMap<>();
        data.put("itemId", gdItems.getItemId());
        data.put("name", gdItems.getName());
        data.put("type", gdItems.getType());
        data.put("stacks", gdItems.getStacks());
        data.put("price", gdItems.getPrice());
        data.put("resName", gdItems.getResName());
        data.put("quality", gdItems.getQuality());
        data.put("comment", gdItems.getComment());
        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取item list数据")
    @RequestMapping(value = "/items/{dungeon_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getItems(@PathVariable int dungeon_id) {
        List<GdDrop> list = gdGameService.getDropListByDungeonId(dungeon_id);
//        List<Map<String, Object>> dropList = new ArrayList<>();
        List<Integer> itemId = new ArrayList<>();
        List<GdItems> itemList = new ArrayList<>();
        for (GdDrop gdd : list) {
            Map<String, Object> data = buildItemArray(gdd);
            List<Map> items = new ArrayList<>();
            if(data.containsKey("items")){
                items = (List<Map>) data.get("items");
                for (Map<String, Integer> map:items) {
                   int item_id = map.get("itemId");
                   if(!itemId.contains(item_id)){
                       itemId.add(item_id);
                       itemList.add(gdGameService.getItemById(item_id));
                   }
                }
            }
        }
        itemId.clear();
        return CommonResult.success(CommonPage.restPage(itemList));
    }

    @ApiOperation(value = "获取bag item数据")
    @RequestMapping(value = "/bagitems", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getBagItems() {
        List<GdBagItems> list = gdGameService.listBagItemsAll();
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取equipment数据")
    @RequestMapping(value = "/equipments", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getEquipments() {
        List<GdEquipment> list = gdGameService.getEquipmentList();
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取equipment数据")
    @RequestMapping(value = "/equipments/{stage}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getEquipmentsByStage(@PathVariable int stage) {
        List<GdEquipment> list = gdGameService.getEquipmentListByStage(stage);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取science数据")
    @RequestMapping(value = "/sciences", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getSciences() {
        List<GdScience> list = gdGameService.getScienceList();
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取science数据")
    @RequestMapping(value = "/sciences/{stage}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getSciencesByStage(@PathVariable int stage) {
        List<GdScience> list = gdGameService.getScienceListByStage(stage);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
