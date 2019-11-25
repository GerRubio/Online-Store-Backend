package com.gerardo.rubio.storeapi.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun apiDocket(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gerardo.rubio.storeapi"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())

    }

    private fun getApiInfo(): ApiInfo {
        return ApiInfo(
                "Store API",
                "Description",
                "1.0.0",
                "Terms of Service",
                "rubio.delavieja@gmail.com",
                "MIT",
                "rubio.delavieja@gmail.com"
        )
    }
}