package com.client;

import org.hibernate.Session;

import com.context.HibernateContextApp;
import com.entity.Student;

public class LoadSingle {
	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Student st = (Student)session.get(Student.class, 1);
		
		System.out.println(st);
	}
}
