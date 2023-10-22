package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insuranceModel.IRDA;


public class InsuranceService {

	private IRDA irda;

	
	public InsuranceService(IRDA irda) {
		super();
		this.irda = irda;
	}

	public double premiumValue(int age) {
		return irda.calculatePremium(age);
	}
	
	public InsuranceService(){
		super();
		System.out.println("Insurance Service");
	}
	@PostConstruct
	public void initialise() {
		System.out.println("called after bean initialised");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("called after bean destroyed");
	}
	
}
