package com.talkweb.numberportability.common.properties;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/6/1
 */
@SpringBootConfiguration
@PropertySource(value = {"classpath:np.properties"})
@ConfigurationProperties(prefix = "np")
public class NpProperties {

    private SwaggerProperties swagger = new SwaggerProperties();


    public SwaggerProperties getSwagger() {
        return swagger;
    }

    public void setSwagger(SwaggerProperties swagger) {
        this.swagger = swagger;
    }
}
