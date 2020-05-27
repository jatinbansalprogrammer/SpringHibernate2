package com.dao.interf;

import java.util.List;

import com.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomer();
	public void saveCustomer(Customer customer);
	public void updateCustomer(int id);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);
	
}
