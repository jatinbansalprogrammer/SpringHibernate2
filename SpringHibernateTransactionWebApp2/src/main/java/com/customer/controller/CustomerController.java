package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String ShowFormForAdd(Model model) {
		
		Customer thecusotmer=new Customer();
		model.addAttribute("customer", thecusotmer);
		return "customer-form";
		
	}
	
	@PostMapping("/saveCustomer")
	public String SaveCustomer(@ModelAttribute("customer") Customer thecustomer){
		customermanager.saveCustomer(thecustomer);
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String updateCustomer(@RequestParam("customerId") int id,Model model){
		Customer customer=customermanager.getCustomer(id);
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int id,@RequestParam("firstname") String firstname,Model model,RedirectAttributes redirectAttributes){
		customermanager.deleteCustomer(id);
		
		redirectAttributes.addFlashAttribute("message", firstname+" has been deleted");
		return "redirect:/customer/list";
	}
	
	
}
