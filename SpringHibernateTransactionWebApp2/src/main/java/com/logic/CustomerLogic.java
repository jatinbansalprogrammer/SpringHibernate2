package com.logic;

import java.util.List;

import com.entity.Customer;

public interface CustomerLogic {
	
	public List<Customer> getcustomer();
	public void saveCustomer(Customer customer);
	public void updateCustomer(int id);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);
	
}
