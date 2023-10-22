package com.account;

public class Account {
	private int accNo;
	private String accType;
	private double initialBal;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getInitialBal() {
		return initialBal;
	}
	public void setInitialBal(double initialBal) {
		this.initialBal = initialBal;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", initialBal=" + initialBal + "]";
	}
	
}
