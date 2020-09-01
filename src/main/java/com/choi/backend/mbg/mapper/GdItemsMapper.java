package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdItems;
import com.choi.backend.mbg.model.GdItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdItemsMapper {
    long countByExample(GdItemsExample example);

    int deleteByExample(GdItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdItems record);

    int insertSelective(GdItems record);

    List<GdItems> selectByExample(GdItemsExample example);

    GdItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdItems record, @Param("example") GdItemsExample example);

    int updateByExample(@Param("record") GdItems record, @Param("example") GdItemsExample example);

    int updateByPrimaryKeySelective(GdItems record);

    int updateByPrimaryKey(GdItems record);
}