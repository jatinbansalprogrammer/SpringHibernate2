package com.springdemo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AddressInfo {
	
	Map addressList;
	
	public AddressInfo(){
		addressList=new LinkedHashMap();
		addressList.put(1,"abcd");
		addressList.put(2,"abcd1");
		addressList.put(3,"abcd2");
	}

	public Map getAddressList() {
		return addressList;
	}

	public void setAddressList(Map addressList) {
		this.addressList = addressList;
	}
	
	
}
