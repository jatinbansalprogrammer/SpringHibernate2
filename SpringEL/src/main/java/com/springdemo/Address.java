package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	public static String city="Bhubaneswar";
	
	public static String state="Odisha";
	
	public static String street="AcharyaVihar";

	public Address() {
		System.out.println("address");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public static String getFAddress() {
		
		String fullAddress="city :"+city+"state :"+state+"street :"+street;
		return fullAddress;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
