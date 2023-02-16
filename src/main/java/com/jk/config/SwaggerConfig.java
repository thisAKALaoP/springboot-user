package com.jk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration   //表示配置文件
@EnableSwagger2  //开启Swagger2
public class SwaggerConfig {

    /*
    swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等，注：让我们的swagger2扫描我们dmsd包
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)  //指定api类型为swagger_2
                .apiInfo(apiInfo())   //定义api文档信息
                .select()   //返回APISelectorBuilder实例，初始化返回一个API选择构造器，用于过滤哪些api需要显示
                .apis(RequestHandlerSelectors.basePackage("com.jk.controller"))  //填写项目中Controller类存放的路径，指定提供接口所在的包
                .build();  //创建Docket对象
    }

    /*
    构建 api文档的信息
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("接口文档")   //文档页标题
                .description("swagger的api文档") //详细信息
                .version("1.0") //文档版本号
                .build(); //创建apiInfo对象
    }
}
