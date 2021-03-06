package com.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Customer;
import com.service.CustomerService;

@Component
public class CustomerLogicImpl implements CustomerLogic{
	
	@Autowired
	CustomerService customerService;
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public CustomerLogicImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Customer> getcustomer() {
		List<Customer> list=customerService.getCustomer();
		return list;
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerService.saveCustomer(customer);
	}

	@Override
	public void updateCustomer(int id) {
		customerService.updateCustomer(id);
	}

	@Override
	public Customer getCustomer(int id) {
		return customerService.getCustomer(id);
	}

	@Override
	public void deleteCustomer(int id) {
		customerService.deleteCustomer(id);
	}
}
