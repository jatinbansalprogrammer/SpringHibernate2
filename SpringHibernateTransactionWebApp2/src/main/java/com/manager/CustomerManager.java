package com.manager;

import java.util.List;

import com.entity.Customer;

public interface CustomerManager {
	
	public List<Customer> getCustomer();
	public void saveCustomer(Customer thecustomer);
	public void updateCustomer(int id);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);
	

}
