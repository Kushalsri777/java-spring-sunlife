package com.example.empmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com")
public class EmpMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMicroServiceApplication.class, args);
	}

}
