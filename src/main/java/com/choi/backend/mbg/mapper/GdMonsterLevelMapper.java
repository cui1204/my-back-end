package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdMonsterLevel;
import com.choi.backend.mbg.model.GdMonsterLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdMonsterLevelMapper {
    long countByExample(GdMonsterLevelExample example);

    int deleteByExample(GdMonsterLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdMonsterLevel record);

    int insertSelective(GdMonsterLevel record);

    List<GdMonsterLevel> selectByExample(GdMonsterLevelExample example);

    GdMonsterLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdMonsterLevel record, @Param("example") GdMonsterLevelExample example);

    int updateByExample(@Param("record") GdMonsterLevel record, @Param("example") GdMonsterLevelExample example);

    int updateByPrimaryKeySelective(GdMonsterLevel record);

    int updateByPrimaryKey(GdMonsterLevel record);
}