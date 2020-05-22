package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Customer;
import com.manager.CustomerManager;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerManager customermanager;

	public CustomerController() {
	}
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customerlist=customermanager.getCustomer();
		model.addAttribute("customerList", customerlist);
		return "list-customers";
		
	}
	
	@GetMapping("/ShowFormForAdd")
	public String ShowFormForAdd() {
		return "AddCustomer";
		
	}
	

}
