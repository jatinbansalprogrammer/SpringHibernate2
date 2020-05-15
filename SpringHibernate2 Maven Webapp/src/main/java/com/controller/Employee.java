package com.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@NotNull(message="is required")
	@Min(value=0,message="must be greater than or equal to zero")
	@Max(value=10,message="must be greater than or equal to 10")
	private Integer empid;
	@NotNull(message="is required")
	private String empname;
	@NotNull(message="is required")
	@Min(value=1000,message="must be greater than or equal to 1000")
	@Max(value=10000,message="must be greater than or equal to 10000")
	private Integer empsalary;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public Integer getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(Integer empsalary) {
		this.empsalary = empsalary;
	}
	
	public static void main(String[] args) {

		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbaabbaab");
		while(m.find()){
			count++;
			System.out.println(m.start());
		}
		System.out.println("no of occurances found:"+count);
	
	}
	
	
	
}
