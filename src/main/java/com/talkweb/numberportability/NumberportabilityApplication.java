package com.talkweb.numberportability;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.talkweb.numberportability.sys.mapper")
public class NumberportabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(NumberportabilityApplication.class, args);
    }

}
