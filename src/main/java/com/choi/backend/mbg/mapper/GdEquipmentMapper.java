package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdEquipment;
import com.choi.backend.mbg.model.GdEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdEquipmentMapper {
    long countByExample(GdEquipmentExample example);

    int deleteByExample(GdEquipmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdEquipment record);

    int insertSelective(GdEquipment record);

    List<GdEquipment> selectByExample(GdEquipmentExample example);

    GdEquipment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdEquipment record, @Param("example") GdEquipmentExample example);

    int updateByExample(@Param("record") GdEquipment record, @Param("example") GdEquipmentExample example);

    int updateByPrimaryKeySelective(GdEquipment record);

    int updateByPrimaryKey(GdEquipment record);
}