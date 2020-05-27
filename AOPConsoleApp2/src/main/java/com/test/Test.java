package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.service.CustomerService;

//@Component("test1")
public class Test {
	
	
	CustomerService customerService;

	
	/**
	 * @return the customerService
	 */
	public CustomerService getCustomerService() {
		return customerService;
	}


	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Test t=context.getBean(Test.class, "test1");
		
		String s=t.customerService.getCustomerById();
		System.out.println(s);
		context.close();
	}

}
