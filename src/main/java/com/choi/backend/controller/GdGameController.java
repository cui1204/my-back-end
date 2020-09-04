package com.choi.backend.controller;

import com.choi.backend.common.api.CommonPage;
import com.choi.backend.common.api.CommonResult;
import com.choi.backend.common.utils.JwtTokenUtil;
import com.choi.backend.mbg.model.*;
import com.choi.backend.service.GdGameService;
import com.choi.backend.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "GdGameController", description = "游戏管理")
@RequestMapping("/game")
public class GdGameController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GdGameController.class);

    @Autowired
    private GdGameService gdGameService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private UmsAdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "游戏用户注册,如果已存在，直接登录，返回token")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult registerAndLogin(@RequestBody UmsAdmin umsAdminParam, BindingResult result) {
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (umsAdmin == null) {
            LOGGER.info("用户:{} 已存在。", umsAdminParam.getUsername());
//            return CommonResult.failed();
        }else{
            LOGGER.info("新用户:{}。创建用户游戏数据", umsAdminParam.getUsername());
            gdGameService.createGameUser(umsAdminParam.getUsername());
        }

        String token = adminService.login(umsAdminParam.getUsername(), umsAdminParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("未取得用户名或密码");
        }

        LOGGER.info("用户:{} 登录。", umsAdminParam.getUsername());

        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
//        return CommonResult.success(umsAdmin);
    }
    @ApiOperation(value = "游戏用户登出")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult logout(@RequestBody UmsAdmin umsAdminParam, BindingResult result) {
//        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
//        if (umsAdmin == null) {
//            LOGGER.info("用户:{} 已存在。", umsAdminParam.getUsername());
////            return CommonResult.failed();
//        }else{
//            LOGGER.info("新用户:{}。创建用户游戏数据", umsAdminParam.getUsername());
//            gdGameService.createGameUser(umsAdminParam.getUsername());
//        }
//
//        String token = adminService.login(umsAdminParam.getUsername(), umsAdminParam.getPassword());
//        if (token == null) {
//            return CommonResult.validateFailed("未取得用户名或密码");
//        }
        gdGameService.setGameUserLogoutTime(umsAdminParam.getUsername());
        LOGGER.info("用户:{} 登出。", umsAdminParam.getUsername());

        Map<String, String> data = new HashMap<>();
//        data.put("token", token);
        return CommonResult.success(data);
    }
    @ApiOperation(value = "获取当前登录的用户信息")
    @RequestMapping(value = "/userinfo", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getUserInfo(HttpServletRequest request) {
        String authHeader = request.getHeader(this.tokenHeader);
        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
            String authToken = authHeader.substring(this.tokenHead.length());// The part after "Bearer "
            String username = jwtTokenUtil.getUserNameFromToken(authToken);
            LOGGER.info("检查用户名 username:{}", username);
            if (username != null ) {
                UmsAdmin umsAdmin = adminService.getAdminByUsername(username);
                if (umsAdmin == null) {
                    LOGGER.info("获取用户信息时未能查询到数据 username:{}", username);
                    return CommonResult.validateFailed("获取用户信息时未能查询到数据！");
                }
                return CommonResult.success(umsAdmin);
            }
        }
        return CommonResult.validateFailed("获取用户信息时未取得token！");
    }


    @ApiOperation(value = "获取用户游戏信息")
    @RequestMapping(value = "/gameuserinfo/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getGameUserInfo(@PathVariable String username) {
//        String username = principal.getName();
        GdUser gdUser = gdGameService.getGameUserByUsername(username);

        Map<String, Object> data = new HashMap<>();
        data.put("username", gdUser.getUsername());
        data.put("player", gdUser.getPlayer());
        data.put("level", gdUser.getLevel());
        data.put("glod", gdUser.getGlod());
        data.put("hp", gdUser.getHp());
        data.put("mp", gdUser.getMp());
        data.put("logoutTime", gdUser.getLogoutTime());
        data.put("schedule", gdUser.getSchedule());
        return CommonResult.success(data);
    }


    @ApiOperation(value = "更新用户游戏信息")
    @RequestMapping(value = "/updategameuser", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateGameUserInfo(@RequestBody GdUser gdUserParam) {
        //更新游戏用户信息
        GdUser gdUser = gdGameService.updateGameUser(gdUserParam);
        if (gdUser == null) {
            LOGGER.info("游戏用户:{} 未找到。", gdUserParam.getUsername());
            return CommonResult.failed();
        }

        //更新登出时间
        gdGameService.setGameUserLogoutTime(gdUser.getUsername());
        LOGGER.info("游戏用户:{} 登出时间 {}。", gdUser.getUsername(), gdUser.getLogoutTime());

        Map<String, Object> data = new HashMap<>();
        data.put("username", gdUser.getUsername());

        return CommonResult.success(data);
    }

    @ApiOperation(value = "更新用户游戏背包")
    @RequestMapping(value = "/updategameuserbag", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateGameUserBag(@RequestBody GdUserBag gdUserBagParam) {
        //更新游戏用户信息
        GdUserBag gdUserBag = gdGameService.updateUserBag(gdUserBagParam);
        if (gdUserBag == null) {
            LOGGER.info("游戏用户:{} 的背包数据未找到。", gdUserBagParam.getUsername());
            return CommonResult.failed();
        }

        Map<String, Object> data = new HashMap<>();
        data.put("username", gdUserBag.getUsername());

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

    @ApiOperation(value = "获取userbag 数据")
    @RequestMapping(value = "/userbag/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getUserBag(@PathVariable String username) {
        GdUserBag gdUserBag = gdGameService.getUserBag(username);
        Map<String, Object> data = new HashMap<>();
        data.put("username", gdUserBag.getUsername());
        data.put("items", gdUserBag.getItems());

        return CommonResult.success(data);
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
