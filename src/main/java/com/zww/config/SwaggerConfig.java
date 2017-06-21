package com.zww.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zhaoww on 2017/4/28.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    /**
     * 
     * Description:  <br> 
     *  
     * @author zhao.ww <br>
     * @taskId <br>
     * @return <br>
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    
    /**
     * 
     * Description: <br> 
     *  
     * @author zhao.ww <br>
     * @taskId <br>
     * @return <br>
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("demo api")
                .version("1.0")
                .build();
    }
}
