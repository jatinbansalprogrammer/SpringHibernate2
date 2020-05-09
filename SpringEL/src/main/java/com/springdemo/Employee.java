package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("1")
	private int id;
	@Value("Priya")
	private String name;
	@Value("#{address.state}")
	private String empState;
	@Value("#{address}")
	private Address Address;
	@Value("")
	private String fullAddress;
	
	public Employee() {
		System.out.println("employee");
	}
	
	public Employee(Address address) {
		this.Address=address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public Address getAddress() {
		return Address;
	}
	
	public void setAddress(Address address) {
		Address = address;
	}
	
	public String getFullAddress() {
		return fullAddress;
	}
	
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empState=" + empState + ", Address=" + Address + "]";
	}

}
