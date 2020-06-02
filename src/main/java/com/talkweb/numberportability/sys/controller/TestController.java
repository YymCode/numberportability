package com.talkweb.numberportability.sys.controller;

import com.alibaba.excel.EasyExcel;
import com.talkweb.numberportability.common.util.R;
import com.talkweb.numberportability.common.util.TestFileUtil;
import com.talkweb.numberportability.sys.entity.TaRpUsNpBusiDealD;
import com.talkweb.numberportability.sys.service.TaRpUsNpBusiDealDService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/6/1
 */
@RestController
@RequestMapping("/api/TestController")
@Api(tags = "测试接口")
@CrossOrigin(origins = "*")
public class TestController {

    @Autowired
    TaRpUsNpBusiDealDService taRpUsNpBusiDealDService;

    /**
     * 获取信息
     */
    @PostMapping("/getdata")
    @ApiOperation("获取用户信息")
    @ApiResponses({@ApiResponse(response = TaRpUsNpBusiDealD.class, code = 0, message = "sucess")})
    public R getdata(){
        List<TaRpUsNpBusiDealD> data = taRpUsNpBusiDealDService.testSelect();
        return R.ok().data(data);
    }

    /**
     * 导出excel文件
     */
    @PostMapping("/simpleWrite")
    @ApiOperation("测试导出")
    public void simpleWrite(){
        String testPath = "C:\\Users\\64234\\Desktop\\";
        String fileName =  testPath+"simpleWrite" + System.currentTimeMillis() + ".xlsx";
        List<TaRpUsNpBusiDealD> data = taRpUsNpBusiDealDService.testSelect();
        System.out.println(TestFileUtil.getPath());
        EasyExcel.write(fileName,TaRpUsNpBusiDealD.class).sheet("模板").doWrite(data);
    }

}
