package com.entity;

public class Customer {
	private String name;
	private String email;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
