package com.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.entity.Customer;

@Component
public class CustomerService {
	
	public CustomerService() {
		System.out.println("hereeeee...");
	}

	public String getCustomerById() {
		return "Customer Object";
	} 

}
