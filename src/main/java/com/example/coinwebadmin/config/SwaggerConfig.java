package com.example.coinwebadmin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(swaggerInfo())
                .groupName("기매의 Test")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.coinwebadmin"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo swaggerInfo() {
        return new ApiInfoBuilder().title("Test API Documentation - 코인 웹사이트 관리자 페이지")
                .description("Swagger UI 간단 예제입니다. 관리자 페이지 API 명세서 만들기")
                .license("기매")
                .licenseUrl("https://maemae22.tistory.com/")
                .version("1.0")
                .build();
    }
}