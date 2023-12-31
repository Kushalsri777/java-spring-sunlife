package com.example.empmicroclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com")
@EnableHystrix
public class EmpMicroClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMicroClientApplication.class, args);
	}

}
