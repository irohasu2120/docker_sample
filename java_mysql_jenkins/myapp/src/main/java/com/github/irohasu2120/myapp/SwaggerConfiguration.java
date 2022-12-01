package com.github.irohasu2120.myapp;

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
public class SwaggerConfiguration {
    /**
     * Springfoxの主構成
     * @return Docket
     */
    @Bean
    public Docket restApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // APIのインフォメーションを設定
                .select()// ApiSelector : Swaggerで書き起こすAPIを選択する。
                .apis(RequestHandlerSelectors.basePackage("com.github.irohasu2120.myapp"))
                .paths(PathSelectors.ant("/**"))// 指定したパスに一致するものだけをSwaggerに起こしてくれる
                .build()
                .useDefaultResponseMessages(false);// 定義していないステータスコードを自動で付与してくれる。今回は自動付与をOFFに
//                .host("localhost:8080")
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("MyApp")
                .description("Sample Spring Boot Rest Application.")
                .version("1.0")
                .build();
    }
}
