package relationship_onetoone;


import org.hibernate.Session;
import org.hibernate.Transaction;
import com.context.HibernateContextApp;
//import com.entity.Employee;

public class Client_laptop {
	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Laptop laptop = new Laptop("HP", "110000");
		Employee employee = new Employee("sarath", "Chennai", laptop);
		session.save(employee);
		tx.commit();
		
		System.out.println("User saved");
	}
}
