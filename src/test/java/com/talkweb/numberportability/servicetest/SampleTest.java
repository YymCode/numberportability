package com.talkweb.numberportability.servicetest;

import com.talkweb.numberportability.sys.entity.TaRpUsNpBusiDealD;
import com.talkweb.numberportability.sys.mapper.TaRpUsNpBusiDealDMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/5/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private TaRpUsNpBusiDealDMapper taRpUsNpBusiDealDMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<TaRpUsNpBusiDealD> userList = taRpUsNpBusiDealDMapper.selectList(null);
        Assert.assertEquals(6, userList.size());
        userList.forEach(System.out::println);
    }
}
