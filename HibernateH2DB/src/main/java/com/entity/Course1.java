package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="title")
	String title;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_id")
	Instructor1 instructor1;
	
	public Course1() {
	}

	public Course1(String title) {
		this.title = title;
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor1 getInstructor1() {
		return instructor1;
	}

	public void setInstructor1(Instructor1 instructor1) {
		this.instructor1 = instructor1;
	}
}
