package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.context.HibernateContextApp;
import com.entity.Student;

public class FetchUser {
	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
//		Query query = session.createQuery("select s from Student s");
		Query query = session.createQuery("from Student");  //this query is called hql hibernate query language

		List<Student> lst = query.list();
		for(Student stu: lst)
		System.out.println(stu);
		
	}
}
