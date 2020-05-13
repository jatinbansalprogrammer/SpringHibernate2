package test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class TestJDBC {

	static String jdbcUrl = "jdbc:h2:tcp://localhost/~/School";
	static String userName = "sa";
	static String password = "";

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();


			Student student = new Student("Vijay", "Garg", "mno@123.com");
			session.save(student);


			/*
			 * Query query = session.createQuery("DELETE FROM Student WHERE ID=:id");
			 * query.setParameter("id", 5); query.executeUpdate();
			 */			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
			System.out.println("");
		}
	}

}
