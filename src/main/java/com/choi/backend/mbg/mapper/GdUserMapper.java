package com.choi.backend.mbg.mapper;

import com.choi.backend.mbg.model.GdUser;
import com.choi.backend.mbg.model.GdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GdUserMapper {
    long countByExample(GdUserExample example);

    int deleteByExample(GdUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GdUser record);

    int insertSelective(GdUser record);

    List<GdUser> selectByExample(GdUserExample example);

    GdUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GdUser record, @Param("example") GdUserExample example);

    int updateByExample(@Param("record") GdUser record, @Param("example") GdUserExample example);

    int updateByPrimaryKeySelective(GdUser record);

    int updateByPrimaryKey(GdUser record);
}