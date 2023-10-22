package com.client;

//import javax.transaction.Transaction;

//import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.context.HibernateContextApp;
import com.entity.Employee;

public class Client {
	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee("user-1", "Delhi");
		session.save(emp);
//		tx.commit();
		System.out.println("User Saved");
		
		Employee em = (Employee)session.get(Employee.class, 3);
//		Employee em = (Employee)session.load(Employee.class, 10);

		System.out.println(em);
	}
}
