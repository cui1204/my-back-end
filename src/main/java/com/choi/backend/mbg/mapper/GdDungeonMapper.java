package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdDungeon;
import com.choi.backend.mbg.model.GdDungeonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GdDungeonMapper {
    long countByExample(GdDungeonExample example);

    int deleteByExample(GdDungeonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdDungeon record);

    int insertSelective(GdDungeon record);

    List<GdDungeon> selectByExample(GdDungeonExample example);

    GdDungeon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdDungeon record, @Param("example") GdDungeonExample example);

    int updateByExample(@Param("record") GdDungeon record, @Param("example") GdDungeonExample example);

    int updateByPrimaryKeySelective(GdDungeon record);

    int updateByPrimaryKey(GdDungeon record);
}