package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	@Column(name = "city")
	private String city;
	
	///@OneToOne(mappedBy = "address", cascade = CascadeType.DETACH)
	//@JoinColumn(name = "address_id")
//	private Student student;

	public Address() {
		
		System.out.println();// TODO Auto-generated constructor stub
	
	}
	public Address(int id, String city) {
			this.id = id; 
			this.city = city;
	}
	public Address(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	/*
	 * public Student getStudent() { return student; } public void
	 * setStudent(Student student) { this.student = student; }
	 */
	
	
}