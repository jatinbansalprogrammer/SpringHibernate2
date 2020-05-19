package main.java.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.core.config.composite.CompositeConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course1;
import com.entity.Instructor1;
import com.entity.InstructorDetail;

public class MainClass {

	public static void main(String[] args) {

		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor1.class).addAnnotatedClass(Course1.class).addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		try{
			session.beginTransaction();
			List<Course1> courselist=new ArrayList<Course1>();
			Course1 coursedata;
			coursedata=new Course1("java");
			courselist.add(coursedata);
			coursedata=new Course1(".net");
			courselist.add(coursedata);
			Instructor1 instructor=new Instructor1("roni", "Sahoo", "rs@abc",courselist);
			session.save(instructor);
			session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
