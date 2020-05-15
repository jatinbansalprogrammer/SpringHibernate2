package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;

public class TestJDBC {

	static String jdbcUrl = "jdbc:h2:tcp://localhost/~/School";
	static String userName = "sa";
	static String password = "";

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Address.class).buildSessionFactory();
		Session session = factory.openSession();

		try {
			session.beginTransaction();
			
			/*
			 * Address address = session.get(Address.class,2);
			 * address.getStudent().setAddress(null); session.delete(address);
			Address address = new Address("Gurgaon");
			 */
			Address a = session.get(Address.class, 5);
			//a.setStudent(null);
			session.delete(a);
			
			session.getTransaction().commit(); 	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
			System.out.println("+++++++++finally");
		}
		
	}

}
