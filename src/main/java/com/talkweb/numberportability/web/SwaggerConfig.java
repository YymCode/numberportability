package com.talkweb.numberportability.web;

import com.talkweb.numberportability.common.properties.NpProperties;
import com.talkweb.numberportability.common.properties.SwaggerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/6/1
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private NpProperties properties;

    @Bean
    public Docket swaggerApi() {
        SwaggerProperties swagger = properties.getSwagger();
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(swagger.getBasePackage()))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo(swagger));
    }

    private ApiInfo apiInfo(SwaggerProperties swagger) {
        return new ApiInfoBuilder()
                .title(swagger.getTitle())
                .description(swagger.getDescription())
                .termsOfServiceUrl(swagger.getUrl())
                .version(swagger.getVersion())
                .contact(new Contact(swagger.getAuthor(),swagger.getUrl(),swagger.getEmail()))
                .build();
    }
}
