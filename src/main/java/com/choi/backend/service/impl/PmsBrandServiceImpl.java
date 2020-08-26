package com.choi.backend.service.impl;

import cn.hutool.core.util.StrUtil;
import com.choi.backend.mbg.mapper.PmsBrandMapper;
import com.choi.backend.mbg.model.PmsBrand;
import com.choi.backend.mbg.model.PmsBrandExample;
import com.choi.backend.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PmsBrandService实现类
 * Created by macro on 2019/4/19.
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public int create(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int update(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int delete(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> list(int pageNum, int pageSize, String name) {
        PageHelper.startPage(pageNum, pageSize);
        PmsBrandExample example = new PmsBrandExample();
        if(StrUtil.isNotEmpty(name)){
            example.createCriteria().andNameLike("%"+name+"%");
        }
        return brandMapper.selectByExample(example);
    }

    @Override
    public PmsBrand detail(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
