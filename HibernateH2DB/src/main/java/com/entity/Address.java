package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "city")
	private String city;

	
	@Column(name="country")
	private String country;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	private Student student;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Address() {

		System.out.println();// TODO Auto-generated constructor stub

	}

	public Address(int id, String city) {
		this.id = id;
		this.city = city;
	}
	public Address(int id, String city, String country) {
		this.id = id;
		this.city = city;
		this.country = country;
	}
	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}

	public Address(String city) {
		this.city = city;
	}

	public Address(int i) {
		this.id = id;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	

}