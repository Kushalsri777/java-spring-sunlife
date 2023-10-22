package com.insuranceModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class IndividualInsurance implements IRDA{
@Value(value="4")
private int duration;
@Value(value="1433.56")
private double amount;

	public IndividualInsurance(){
	
	}
	@Override
	public double calculatePremium(int age) {
		// TODO Auto-generated method stub
		return amount*age/duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
