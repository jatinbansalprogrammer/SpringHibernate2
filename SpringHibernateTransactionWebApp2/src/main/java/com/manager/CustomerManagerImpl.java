package com.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

}
