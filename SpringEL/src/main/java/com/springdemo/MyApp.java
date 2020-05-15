package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("C:/Users/yatanku/SpringHibernateGit/SpringHibernate2/SpringEL/SpringEL/src/main/resources/beans.xml");
		
		Employee emp=context.getBean("employee",Employee.class);
		System.out.println(emp);
		
	}

}
