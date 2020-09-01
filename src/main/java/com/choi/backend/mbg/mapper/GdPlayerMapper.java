package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdPlayer;
import com.choi.backend.mbg.model.GdPlayerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdPlayerMapper {
    long countByExample(GdPlayerExample example);

    int deleteByExample(GdPlayerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GdPlayer record);

    int insertSelective(GdPlayer record);

    List<GdPlayer> selectByExample(GdPlayerExample example);

    GdPlayer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GdPlayer record, @Param("example") GdPlayerExample example);

    int updateByExample(@Param("record") GdPlayer record, @Param("example") GdPlayerExample example);

    int updateByPrimaryKeySelective(GdPlayer record);

    int updateByPrimaryKey(GdPlayer record);
}