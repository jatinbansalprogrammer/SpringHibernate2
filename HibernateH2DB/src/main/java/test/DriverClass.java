package test;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class DriverClass {

	public static void main(String[] args) {

		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
		session.beginTransaction();
		
		Employee emp=new Employee("Priya");
		session.save(emp);
		session.beginTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
		
		
	}

}
