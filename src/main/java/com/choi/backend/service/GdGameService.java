package com.choi.backend.service;


import com.choi.backend.mbg.model.*;

import java.util.List;

public interface GdGameService {

    /**
     * 首次创建用户游戏数据
     */
    GdUser createGameUser(String username);

    GdUser setGameUserLogoutTime(String username);
    GdUser updateGameUser(GdUser gdUserParam);

    /**
     * 根据用户名获取用户
     */
    GdUser getGameUserByUsername(String username);

    /**
     * 根据用户id获取用户
     */
    GdUser getUserById(int id);


    /**
     * 根据获取player资源数据
     */
    GdPlayer getPlayerById(int id);

    /**
     * 根据副本id获取Dungeon
     */
    GdDungeon getDungeonById(int id);

    /**
     * 根据Dungeon id获取level
     */
    List<GdLevel> getLevelListByDungeonId(int dungeon_id);

    /**
     * 根据id获取monster
     */
    GdMonster getMonsterById(int id);

    /**
     * 获取当前副本下的monster列表
     * @param dungeon_id
     * @return
     */
    List<GdMonster> getMonsterListByDungeonId(int dungeon_id);

    /**
     * 根据id获取monster level
     */
    GdMonsterLevel getMonsterLevelById(int id);
    /**
     * 查询所有monster_level数据
     */
    List<GdMonsterLevel> getMonsterLevelList();

    /**
     * 根据id获取drop
     */
    GdDrop getDropById(int id);

    /**
     * 获取副本下的所有掉落数据
     * @param dungeon_id
     * @return
     */
    List<GdDrop> getDropListByDungeonId(int dungeon_id);

    /**
     *根据名称获取level map
     */
    GdMap getMapByName(String name);
    List<GdMap> getMapListById(int id);
    GdMap getMapByPid(int id);

    /**
     *根据id获取items
     */
    GdItems getItemById(int id);

    /**
     * 获取指定副本下的所有item
     * @param dungeon_id
     * @return
     */
    List<GdItems> getItemListByDungeonId(int dungeon_id);


    /**
     * 获取bag
     */
    GdUserBag getUserBag(String username);

    /**
     * 保存bag
     */
    GdUserBag updateUserBag(GdUserBag gdUserBagParam);

    /**
     * 装备
     * @param equipment_id
     * @return
     */
    GdEquipment getEquipmentById(int equipment_id);
    List<GdEquipment> getEquipmentList();
    List<GdEquipment> getEquipmentListByStage(int stage);


    GdScience getScienceById(int science_id);
    List<GdScience> getScienceList();
    List<GdScience> getScienceListByStage(int stage);
}
