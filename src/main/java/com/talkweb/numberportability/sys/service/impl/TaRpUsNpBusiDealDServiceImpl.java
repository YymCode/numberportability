package com.talkweb.numberportability.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.talkweb.numberportability.sys.entity.TaRpUsNpBusiDealD;
import com.talkweb.numberportability.sys.mapper.TaRpUsNpBusiDealDMapper;
import com.talkweb.numberportability.sys.service.TaRpUsNpBusiDealDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/6/1
 */
@Service
public class TaRpUsNpBusiDealDServiceImpl implements TaRpUsNpBusiDealDService {


    @Autowired
    private TaRpUsNpBusiDealDMapper taRpUsNpBusiDealDMapper;


    @Override
    public List<TaRpUsNpBusiDealD> testSelect() {
        QueryWrapper<TaRpUsNpBusiDealD> queryWrapper = new QueryWrapper<>();
        List<TaRpUsNpBusiDealD> userList = taRpUsNpBusiDealDMapper.selectList(queryWrapper);
        return userList;


    }
}
