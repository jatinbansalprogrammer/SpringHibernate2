package com.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Customer;
import com.logic.CustomerLogic;

@Component
public class CustomerManagerImpl implements CustomerManager{
	
	@Autowired
	CustomerLogic customerlogic;

	public CustomerManagerImpl() {
	}

	@Override
	public List<Customer> getCustomer() {
		List<Customer> list=customerlogic.getcustomer();
		return list;
	}

	@Transactional
	@Override
	public void saveCustomer(Customer customer) {
		customerlogic.saveCustomer(customer);
	}

	@Override
	public void updateCustomer(int id) {
		customerlogic.updateCustomer(id);
	}

	@Transactional
	@Override
	public Customer getCustomer(int id) {
		return customerlogic.getCustomer(id);
	}

	@Transactional
	@Override
	public void deleteCustomer(int id) {
		customerlogic.deleteCustomer(id);
	}

}
