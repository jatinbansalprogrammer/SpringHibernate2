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
				.addAnnotatedClass(Instructor1.class).addAnnotatedClass(Course1.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		try{
			session.beginTransaction();

			Instructor1 instructor = new Instructor1("roni", "Sahoo", "rs@abc");

			Course1 coursedata = new Course1("java");
			instructor.addCourse(coursedata);
			Course1 coursedata2 = new Course1(".net");
			instructor.addCourse(coursedata2);

			session.save(instructor);
			 
			/*
			 * Instructor1 instructor=session.get(Instructor1.class,33);
			 * System.out.println(instructor.getCourselist()); session.delete(instructor);
			 */
			session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
