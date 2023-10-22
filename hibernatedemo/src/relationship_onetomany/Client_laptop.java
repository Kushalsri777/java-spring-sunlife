package relationship_onetomany;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.context.HibernateContextApp;
//import com.entity.Employee;

public class Client_laptop {
	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Laptop laptop = new Laptop("HP", "110000");
		Laptop laptop2 = new Laptop("Lenovo", "210000");
		ArrayList<Laptop>al = new ArrayList<Laptop>();
		al.add(laptop);
		al.add(laptop2);
		Employee employee = new Employee("sarath", "Chennai", al);
		session.save(employee);
		tx.commit();
		
		System.out.println("User saved");
	}
}
