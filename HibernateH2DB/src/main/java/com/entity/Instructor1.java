package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="instructor")
public class Instructor1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="first_name")
	String firstname;
	@Column(name="last_name")
	String lastname;
	@Column(name="email")
	String email;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="INSTRUTOR_DETAIL_ID ")*/
	
	@Transient
	InstructorDetail instructordetail;
	
	@OneToMany(mappedBy="instructor1" ,cascade=CascadeType.ALL)
	List<Course1> courselist;
	

	
	public Instructor1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Instructor1(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}



	public Instructor1(String firstname, String lastname, String email, List<Course1> courselist) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.courselist = courselist;
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
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the instructordetail
	 */
	public InstructorDetail getInstructordetail() {
		return instructordetail;
	}

	/**
	 * @param instructordetail the instructordetail to set
	 */
	public void setInstructordetail(InstructorDetail instructordetail) {
		this.instructordetail = instructordetail;
	}

	
	
	/**
	 * @return the courselist
	 */
	public List<Course1> getCourselist() {
		return courselist;
	}


	/**
	 * @param courselist the courselist to set
	 */
	public void setCourselist(List<Course1> courselist) {
		this.courselist = courselist;
	}

	/**
	 * @return the instructordetailid
	 */

	public void addCourse(Course1 course) {
		if(courselist == null) {
			courselist = new ArrayList<Course1>();
		}
		courselist.add(course);
		course.setInstructor1(this);
	}
	
}