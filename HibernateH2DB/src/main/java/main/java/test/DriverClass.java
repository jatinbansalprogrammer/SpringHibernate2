package main.java.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Employee;





public class DriverClass {

	public static void main(String[] args) {
		

		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
		session.beginTransaction();
		
		Address address=new Address("Hydrabad");
		Employee emp=new Employee("siva reddy", address);	
		session.save(emp);
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
		
		
	}

}
