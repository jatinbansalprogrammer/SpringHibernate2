package main.java.test;

import java.beans.Introspector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Instructor;

public class DriverClass {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			Instructor instructor= null;
			Course course= null;
			
			instructor = session.get(Instructor.class, 6);
			course = instructor.getCourseList().get(0);
			course.setInstructor(null);
			
			instructor.getCourseList().remove(0);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();

			System.out.println("Finally");
		}

	}

}
