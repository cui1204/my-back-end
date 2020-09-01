package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdMap;
import com.choi.backend.mbg.model.GdMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdMapMapper {
    long countByExample(GdMapExample example);

    int deleteByExample(GdMapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdMap record);

    int insertSelective(GdMap record);

    List<GdMap> selectByExample(GdMapExample example);

    GdMap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdMap record, @Param("example") GdMapExample example);

    int updateByExample(@Param("record") GdMap record, @Param("example") GdMapExample example);

    int updateByPrimaryKeySelective(GdMap record);

    int updateByPrimaryKey(GdMap record);
}