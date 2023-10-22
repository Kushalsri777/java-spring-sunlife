package com.insuranceModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ff")
public class FamilyFloater implements IRDA{
@Value(value="5")
private int duration;
@Value(value="1345.44")
private double amount;

	FamilyFloater(){
		System.out.println("Family Floater");
	}
	@Override
	public double calculatePremium(int age) {
		// TODO Auto-generated method stub
		return amount*12/duration;
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
