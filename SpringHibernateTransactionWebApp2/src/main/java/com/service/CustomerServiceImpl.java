package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.interf.CustomerDao;
import com.entity.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerdao;

	public CustomerServiceImpl() {
	}

	@Override
	public List<Customer> getCustomer() {
		List<Customer> customerList=customerdao.getCustomer();
		return customerList;
	}
	
	

}