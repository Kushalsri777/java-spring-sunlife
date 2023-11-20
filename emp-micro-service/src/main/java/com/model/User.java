package com.model;

public class User {
	private int uId;
	private String uname;
	private String email;
	private String city;
	public User(int uId, String uname, String email, String city) {
		super();
		this.uId = uId;
		this.uname = uname;
		this.email = email;
		this.city = city;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
