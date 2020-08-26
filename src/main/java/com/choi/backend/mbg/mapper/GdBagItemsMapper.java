package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdBagItems;
import com.choi.backend.mbg.model.GdBagItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GdBagItemsMapper {
    long countByExample(GdBagItemsExample example);

    int deleteByExample(GdBagItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdBagItems record);

    int insertSelective(GdBagItems record);

    List<GdBagItems> selectByExample(GdBagItemsExample example);

    GdBagItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdBagItems record, @Param("example") GdBagItemsExample example);

    int updateByExample(@Param("record") GdBagItems record, @Param("example") GdBagItemsExample example);

    int updateByPrimaryKeySelective(GdBagItems record);

    int updateByPrimaryKey(GdBagItems record);
}