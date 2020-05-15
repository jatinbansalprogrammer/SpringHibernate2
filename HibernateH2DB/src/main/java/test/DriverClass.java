package test;

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
			/*
			 * Address address=new Address("BBSR"); Employee emp=new
			 * Employee("Priya","Sahoo","pdsahoo.1@gmail.com","TSS",address);
			 * session.save(emp);
			 */
		List<Employee> employee=session.createQuery("From Employee").getResultList();
		for(Employee e:employee) {
			System.out.println(e.getFirst_name());
		}
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
		
		
	}

}
