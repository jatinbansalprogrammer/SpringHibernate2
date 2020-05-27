package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	@Value("#{T(com.entity.Customer).get()}")
	private String name;
	private String email;
	private Address address;
	
	public Customer() {
	}
  
	public static String get(){
		return "priya";
	}
	/*public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}*/
	

	public String getName() {
		return name;
	}
    
	public void setName( String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
	
}
