package com.example.springcore;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class Project {
	private String pName;
	private String location;
	private String noOfEmp;
	private String budget;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(String noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	
	@Bean
	@Profile("india")
	public String indiaDBConnect() {
		System.out.println(pName);
		System.out.println(location);
		System.out.println(noOfEmp);
		System.out.println(budget);
		return "connected to india";
	}
	
	@Bean
	@Profile("usa")
	public String usaDBConnect() {
		System.out.println(pName);
		System.out.println(location);
		System.out.println(noOfEmp);
		System.out.println(budget);
		return "connected to usa";
	}
	
	@Bean
	@Profile("uk")
	public String ukDBConnect() {
		System.out.println(pName);
		System.out.println(location);
		System.out.println(noOfEmp);
		System.out.println(budget);
		return "connected to uk";
	}
}
