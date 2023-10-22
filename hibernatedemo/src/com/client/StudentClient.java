package com.client;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.context.HibernateContextApp;
import com.entity.Student;

public class StudentClient {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Student stu = new Student(56, "Kushal", "Bangalore");
		session.save(stu);
		tx.commit();
		System.out.println("Student saved");
	}

}
