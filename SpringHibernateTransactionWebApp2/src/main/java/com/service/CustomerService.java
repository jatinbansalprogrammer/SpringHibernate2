package com.service;

import java.util.List;

import com.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();
	public void saveCustomer(Customer customer);
	public void updateCustomer(int id);
	public Customer getCustomer(int id);

}
