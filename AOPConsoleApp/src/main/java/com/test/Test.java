package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.service.CustomerService;
@Component(value = "test")
public class Test {
	
	CustomerService customerService;
	
	public CustomerService getCustomerService() {
		return customerService;
	}
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
		System.out.println(this.customerService);
	}
	public static void main(String[] args) {
		//AOP: Aspect Oriented Programming.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		try {
			Test t = ctx.getBean(Test.class, "test");
			List<String> l = t.customerService.getCustomerById(new Customer("name", "email"), 100);
			System.out.println("Hello");
			t.customerService.setAb(null);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}

	}

}
