package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insuranceModel.IRDA;

@Service("service")
public class InsuranceService {
	
	@Autowired
	@Qualifier("ff")
	private IRDA irda;

	public IRDA getIrda() {
		return irda;
	}

	public void setIrda(IRDA irda) {
		this.irda = irda;
	}
	public double premiumValue(int age) {
		return irda.calculatePremium(age);
	}
	
	InsuranceService(){
		System.out.println("Insurance Service");
	}
	public void initialise() {
		System.out.println("called after bean initialised");
	}
	public void destroy() {
		System.out.println("called after bean destroyed");
	}
	
}
