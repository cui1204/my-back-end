package com.choi.backend.service.impl;

import com.choi.backend.mbg.mapper.*;
import com.choi.backend.mbg.model.*;
import com.choi.backend.service.GdGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GdGameServiceImpl implements GdGameService {

    @Autowired
    private GdUserMapper gdUserMapper;
    @Autowired
    private GdPlayerMapper gdPlayerMapper;
    @Autowired
    private GdLevelMapper gdLevelMapper;
    @Autowired
    private GdDungeonMapper gdDungeonMapper;
    @Autowired
    private GdMonsterMapper gdMonsterMapper;
    @Autowired
    private GdMonsterLevelMapper gdMonsterLevelMapper;
    @Autowired
    private GdDropMapper gdDropMapper;
    @Autowired
    private GdMapMapper gdMapMapper;
    @Autowired
    private GdItemsMapper gdItemsMapper;
    @Autowired
    private GdBagItemsMapper gdBagItemsMapper;
    @Autowired
    private GdEquipmentMapper gdEquipmentMapper;
    @Autowired
    private GdScienceMapper gdScienceMapper;

    @Override
    public GdUser getByUsername(String username) {
        GdUserExample example = new GdUserExample();
        example.createCriteria().andUsernameEqualTo(username);
//        example.createCriteria().andUsernameEqualTo(username);
        List<GdUser> adminList = gdUserMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
//            admin = adminList.get(0);
//            adminCacheService.setAdmin(admin);
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public GdUser getUserById(int id) {
        return null;
    }

    @Override
    public GdPlayer getPlayerById(int id) {
        GdPlayerExample example = new GdPlayerExample();
        example.createCriteria().andPlayerIdEqualTo(id);
        List<GdPlayer> playerList = gdPlayerMapper.selectByExample(example);
        if (playerList != null && playerList.size() > 0) {
            return playerList.get(0);
        }
        return null;
    }

    @Override
    public GdDungeon getDungeonById(int id) {
        GdDungeonExample example = new GdDungeonExample();
        example.createCriteria().andDungeonIdEqualTo(id);
        List<GdDungeon> dungeonList = gdDungeonMapper.selectByExample(example);
        if (dungeonList != null && dungeonList.size() > 0) {
            return dungeonList.get(0);
        }
        return null;
    }

    @Override
    public List<GdLevel> getLevelListByDungeonId(int dungeon_id) {
        GdLevelExample example = new GdLevelExample();
        example.createCriteria().andDungeonIdEqualTo(dungeon_id);

        List<GdLevel> levelList = gdLevelMapper.selectByExample(example);
        if (levelList != null) {
            return levelList;
        }
        return null;
    }


    @Override
    public GdMonster getMonsterById(int id) {
        GdMonsterExample example = new GdMonsterExample();
        example.createCriteria().andMonsterIdEqualTo(id);
        List<GdMonster> monsterList = gdMonsterMapper.selectByExample(example);
        if (monsterList != null && monsterList.size() > 0) {
            return monsterList.get(0);
        }
        return null;
    }

    @Override
    public List<GdMonster> getMonsterListByDungeonId(int dungeon_id) {
        List<GdLevel> levelList = this.getLevelListByDungeonId(dungeon_id);
        List<GdMonster> monsterList = new ArrayList<>();
        for (GdLevel gdl:levelList) {
          if(gdl.getDungeonId()==dungeon_id){
                monsterList.add(this.getMonsterById(gdl.getMonsterId()));
          }
        }
        if(monsterList!=null&&monsterList.size()>0){
                return monsterList;
        }
        return null;
    }

    @Override
    public GdMonsterLevel getMonsterLevelById(int id) {
        GdMonsterLevelExample example = new GdMonsterLevelExample();
        example.createCriteria().andMonsterLevelIdEqualTo(id);
        List<GdMonsterLevel> monsterLevelList = gdMonsterLevelMapper.selectByExample(example);
        if (monsterLevelList != null && monsterLevelList.size() > 0) {
            return monsterLevelList.get(0);
        }
        return null;
    }

    @Override
    public List<GdMonsterLevel> getMonsterLevelList() {
        GdMonsterLevelExample example = new GdMonsterLevelExample();
        example.createCriteria().andLevelIsNotNull();

        List<GdMonsterLevel> monsterLevelList = gdMonsterLevelMapper.selectByExample(example);
        if (monsterLevelList != null) {
            return monsterLevelList;
        }
        return null;
    }

    @Override
    public GdDrop getDropById(int id) {
        GdDropExample example = new GdDropExample();
        example.createCriteria().andDropIdEqualTo(id);
        List<GdDrop> dropList = gdDropMapper.selectByExample(example);
        if (dropList != null && dropList.size() > 0) {
            return dropList.get(0);
        }
        return null;
    }

    @Override
    public List<GdDrop> getDropListByDungeonId(int dungeon_id) {
        List<GdLevel> levelList = this.getLevelListByDungeonId(dungeon_id);
        List<GdDrop> dropList = new ArrayList<>();
        for (GdLevel gdl:levelList) {
            if(gdl.getDungeonId()==dungeon_id){
                dropList.add(this.getDropById(gdl.getDropId()));
            }
        }
        if(dropList!=null&&dropList.size()>0){
            return dropList;
        }
        return null;
    }

    @Override
    public GdMap getMapByName(String name) {
        return null;
    }

    @Override
    public List<GdMap> getMapListById(int id) {
        GdMapExample example = new GdMapExample();
        example.createCriteria().andMapIdEqualTo(id);

        List<GdMap> levelMapList = gdMapMapper.selectByExample(example);
        if (levelMapList != null) {
            return levelMapList;
        }
        return null;
    }

    @Override
    public GdMap getMapByPid(int id) {

        return gdMapMapper.selectByPrimaryKey(id);
    }

    @Override
    public GdItems getItemById(int id) {
        GdItemsExample example = new GdItemsExample();
        example.createCriteria().andItemIdEqualTo(id);
        List<GdItems> itemsList = gdItemsMapper.selectByExample(example);
        if (itemsList != null && itemsList.size() > 0) {
            return itemsList.get(0);
        }
        return null;
    }

    @Override
    public List<GdItems> getItemListByDungeonId(int dungeon_id) {
//        List<GdLevel> levelList = this.getLevelListByDungeonId(dungeon_id);
//
//        List<GdItems> itemList = new ArrayList<>();
//        for (GdLevel gdl:levelList) {
//            if(gdl.getDungeonId()==dungeon_id){
//                itemList.add(this.getItemListByDungeonId(gdl.getDropId()));
//            }
//        }
//        if(dropList!=null&&dropList.size()>0){
//            return dropList;
//        }
        return null;
    }


    @Override
    public List<GdBagItems> listBagItemsAll() {
        GdBagItemsExample example = new GdBagItemsExample();
        example.createCriteria().andIdIsNotNull();
        List<GdBagItems> bagItemsList = gdBagItemsMapper.selectByExample(example);
        if (bagItemsList != null) {
            return bagItemsList;
        }
        return null;
    }

    @Override
    public GdEquipment getEquipmentById(int equipment_id) {

        return null;
    }

    @Override
    public List<GdEquipment> getEquipmentList() {
        GdEquipmentExample example = new GdEquipmentExample();
        example.createCriteria().andEquipmentIdIsNotNull();
        List<GdEquipment> equipmentList = gdEquipmentMapper.selectByExample(example);
        if(equipmentList!=null){
            return equipmentList;
        }
        return null;
    }

    @Override
    public List<GdEquipment> getEquipmentListByStage(int stage) {
        GdEquipmentExample example = new GdEquipmentExample();
        example.createCriteria().andStageEqualTo(stage);
        List<GdEquipment> equipmentList = gdEquipmentMapper.selectByExample(example);
        if(equipmentList!=null){
            return equipmentList;
        }
        return null;
    }

    @Override
    public GdScience getScienceById(int science_id) {
        return null;
    }

    @Override
    public List<GdScience> getScienceList() {
        GdScienceExample example = new GdScienceExample();
        example.createCriteria().andScienceIdIsNotNull();
        List<GdScience> scienceList = gdScienceMapper.selectByExample(example);
        if(scienceList!=null){
            return scienceList;
        }
        return null;
    }

    @Override
    public List<GdScience> getScienceListByStage(int stage) {
        GdScienceExample example = new GdScienceExample();
        example.createCriteria().andStageEqualTo(stage);
        List<GdScience> scienceList = gdScienceMapper.selectByExample(example);
        if(scienceList!=null){
            return scienceList;
        }
        return null;
    }
}
