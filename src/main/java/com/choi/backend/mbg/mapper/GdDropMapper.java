package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdDrop;
import com.choi.backend.mbg.model.GdDropExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GdDropMapper {
    long countByExample(GdDropExample example);

    int deleteByExample(GdDropExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdDrop record);

    int insertSelective(GdDrop record);

    List<GdDrop> selectByExample(GdDropExample example);

    GdDrop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdDrop record, @Param("example") GdDropExample example);

    int updateByExample(@Param("record") GdDrop record, @Param("example") GdDropExample example);

    int updateByPrimaryKeySelective(GdDrop record);

    int updateByPrimaryKey(GdDrop record);
}