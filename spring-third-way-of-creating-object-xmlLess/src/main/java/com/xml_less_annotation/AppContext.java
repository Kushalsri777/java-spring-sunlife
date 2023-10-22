package com.xml_less_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.insuranceModel.FamilyFloater;
import com.insuranceModel.IndividualInsurance;
import com.service.InsuranceService;

@Configuration
@ComponentScan("com")
public class AppContext {
	@Bean
	public FamilyFloater ff() {
		return new FamilyFloater();
	}
	@Bean
	public IndividualInsurance ii() {
		return new IndividualInsurance();
	}
	@Bean
	public InsuranceService service(){
		return new InsuranceService(ff());
	}

}
