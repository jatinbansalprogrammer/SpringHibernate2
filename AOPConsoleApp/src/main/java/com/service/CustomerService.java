package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.CustomerDAO;
import com.entity.Customer;

@Component
public class CustomerService {
	@Autowired
	CustomerDAO customerDAO;
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}


	/*
	 * public Customer getCustomerById(Integer id) { return
	 * customerDAO.getCustomerById(id);
	 * 
	 * }
	 */
	
	
	public String getCustomerById(Customer customer) {
		return "Customer Object";
	}
	public List<String> getCustomerById(Customer customer, int i) {
		
		List<String> list = null;//new ArrayList<String>();
		list.add("a");
		list.add("b");
		return list;
	}
	

}
