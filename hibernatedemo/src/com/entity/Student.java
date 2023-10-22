package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stu")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sturoll")
	private int rollNo;
	private String name;
	private String claass;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClaass() {
		return claass;
	}
	public void setClaass(String claass) {
		this.claass = claass;
	}
	public Student(int rollNo, String name, String claass) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.claass = claass;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", claass=" + claass + "]";
	}
	
}
