package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Transient
	private Integer InstructorDetailId;

	@OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
	private List<Course> courseList;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Instructor(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getInstructorDetailId() {
		return InstructorDetailId;
	}

	public void setInstructorDetailId(Integer instructorDetailId) {
		InstructorDetailId = instructorDetailId;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	public void addCourse(Course course) {
		if(courseList == null) {
			courseList = new ArrayList<Course>();
		}
		courseList.add(course);
		course.setInstructor(this);
	}
	
	public Instructor() {
		// TODO Auto-generated constructor stub
	}

}
