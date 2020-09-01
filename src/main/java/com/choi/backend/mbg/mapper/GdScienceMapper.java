package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdScience;
import com.choi.backend.mbg.model.GdScienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdScienceMapper {
    long countByExample(GdScienceExample example);

    int deleteByExample(GdScienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdScience record);

    int insertSelective(GdScience record);

    List<GdScience> selectByExample(GdScienceExample example);

    GdScience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdScience record, @Param("example") GdScienceExample example);

    int updateByExample(@Param("record") GdScience record, @Param("example") GdScienceExample example);

    int updateByPrimaryKeySelective(GdScience record);

    int updateByPrimaryKey(GdScience record);
}