package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdLevel;
import com.choi.backend.mbg.model.GdLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GdLevelMapper {
    long countByExample(GdLevelExample example);

    int deleteByExample(GdLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdLevel record);

    int insertSelective(GdLevel record);

    List<GdLevel> selectByExample(GdLevelExample example);

    GdLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdLevel record, @Param("example") GdLevelExample example);

    int updateByExample(@Param("record") GdLevel record, @Param("example") GdLevelExample example);

    int updateByPrimaryKeySelective(GdLevel record);

    int updateByPrimaryKey(GdLevel record);
}