package com.example.productmsmono;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories("com.repo")
@EntityScan("com.entity")
//@EnableSwagger2
@EnableEurekaClient
@OpenAPIDefinition(info = @Info(title = "user", description = "des", version = ""))
public class ProductMsMonoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMsMonoApplication.class, args);
	}
	
//	@Bean
//	public Docket swaggerconf() {
//		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com")).build().apiInfo(apiDetails());
//	}
//	private ApiInfo apiDetails() {
//		return new ApiInfo("Sunlife Api Doc", "Sample API for End User Review", "1.3.4", "For Internal Use Only", new springfox.documentation.service.Contact("Kushal", "http://www.asreet-tech.com", "connect@asreet-tech.com"), "API License", "http://www.sunlife.com", Collections.emptyList());
//	}

}
