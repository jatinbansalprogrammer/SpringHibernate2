package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.service.CustomerService;

@Component
public class Test2 {
	
	


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer t=context.getBean(Customer.class, "customer");
		System.out.println(t.getName());
		context.close();
	}

}
