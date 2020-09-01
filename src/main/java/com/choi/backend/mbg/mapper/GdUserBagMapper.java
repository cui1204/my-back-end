package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdUserBag;
import com.choi.backend.mbg.model.GdUserBagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdUserBagMapper {
    long countByExample(GdUserBagExample example);

    int deleteByExample(GdUserBagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdUserBag record);

    int insertSelective(GdUserBag record);

    List<GdUserBag> selectByExample(GdUserBagExample example);

    GdUserBag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdUserBag record, @Param("example") GdUserBagExample example);

    int updateByExample(@Param("record") GdUserBag record, @Param("example") GdUserBagExample example);

    int updateByPrimaryKeySelective(GdUserBag record);

    int updateByPrimaryKey(GdUserBag record);
}