package task_emp_lap_add;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.context.HibernateContextApp;
//import com.entity.Employee;

public class Client_laptop {
	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Laptop laptop = new Laptop("HP", "110000");
		
		Address add = new Address("Suryanagar", "Gorakhpur");
		Address add2 = new Address("Clock Tower", "Gorakhpur");

		ArrayList<Address> al=new ArrayList<>();
		al.add(add);
		al.add(add2);
		Employee employee = new Employee("sarath", "Chennai", al, laptop);
		session.save(employee);
		tx.commit();
		
		System.out.println("User saved");
	}
}
