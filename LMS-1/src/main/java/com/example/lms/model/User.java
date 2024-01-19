package com.example.lms.model;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="students")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "std_id")
	private int std_id;
	@Column(name = "full_name")
	private String full_Name;
	@Column(name = "qualification")
	private String qualification;
	@Column(name = "email_address", unique = true)
	private String email_Address;
	@Column(name = "password")
	private String password;
	@Column(name = "contact_no")
	private long contact_No;
	@Column(name = "course")
	private String course;
	@Column(name = "address")
	private String address;
	@Column(name = "dob")
	private String dob;
	@Column(name = "role")
	private String role ;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getContact_No() {
		return contact_No;
	}
	public void setContact_No(long contact_No) {
		this.contact_No = contact_No;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}


	public String getFull_Name() {
		return full_Name;
	}
	public void setFull_Name(String full_Name) {
		this.full_Name = full_Name;
	}
	public String getEmail_Address() {
		return email_Address;
	}
	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public User() {
        // Set "student" as the default value for the role field in the constructor
        //this.role = "student";
    }
	public User(int std_id) {
        this.std_id = std_id;
    }
	
	
}