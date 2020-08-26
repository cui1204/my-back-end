package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdMonster;
import com.choi.backend.mbg.model.GdMonsterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GdMonsterMapper {
    long countByExample(GdMonsterExample example);

    int deleteByExample(GdMonsterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GdMonster record);

    int insertSelective(GdMonster record);

    List<GdMonster> selectByExample(GdMonsterExample example);

    GdMonster selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GdMonster record, @Param("example") GdMonsterExample example);

    int updateByExample(@Param("record") GdMonster record, @Param("example") GdMonsterExample example);

    int updateByPrimaryKeySelective(GdMonster record);

    int updateByPrimaryKey(GdMonster record);
}