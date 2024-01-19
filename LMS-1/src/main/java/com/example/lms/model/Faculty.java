package com.example.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="Faculty_Details")
public class Faculty {
		
		
		@Id
		@Column(name="Faculty_ID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int faculty_id;
		
		@Column(name="Faculty_Name")
		private String faculty_name;
		
		@Column(name="Faculty_Mobile")
		private long faculty_mobile;
		
		@Column(name="Faculty_Role")
		private String faculty_role;
		
		@Column(name="Password")
		private String password;
		
		@Column(name="Faculty_Email")
		private String email;
		
		@Column(name="Faculty_DOB")
		private String dob;

		@Column(name="Faculty_Qualification")
		private String qualification;
		
		@Column(name="Faculty_Address")
		private String faculty_address;
		
		@Column(name="Faculty_Zipcode")
		private long zipcode;
		
		@Column(name="Faculty_Courses")
		private String faculty_courses;

	

		public Faculty(int faculty_id, String faculty_name, long faculty_mobile, String faculty_role,String password,String email,
				String dob, String qualification,String faculty_address, long zipcode,String faculty_courses) {
			super();
			this.faculty_id = faculty_id;
			this.faculty_name = faculty_name;
			this.faculty_mobile = faculty_mobile;
			this.faculty_role = faculty_role;
			this.password = password;
			this.email=email;
			this.dob = dob;
			this.qualification = qualification;
			this.faculty_address = faculty_address;
			this.zipcode = zipcode;
			this.faculty_courses=faculty_courses;
		}
		
		
		public Faculty() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Faculty(String faculty_name2) {
			// TODO Auto-generated constructor stub
		}


		public int getFaculty_id() {
			return faculty_id;
		}
		public void setFaculty_id(int faculty_id) {
			this.faculty_id = faculty_id;
		}
		public String getFaculty_name() {
			return faculty_name;
		}
		public void setFaculty_name(String faculty_name) {
			this.faculty_name = faculty_name;
		}
		public long getFaculty_mobile() {
			return faculty_mobile;
		}
		public void setFaculty_mobile(long faculty_mobile) {
			this.faculty_mobile = faculty_mobile;
		}
		public String getFaculty_role() {
			return faculty_role;
		}
		public void setFaculty_role(String faculty_role) {
			this.faculty_role = faculty_role;
		}
		
		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getDob() {
			return dob;
		}


		public void setDob(String dob) {
			this.dob = dob;
		}


		public String getQualification() {
			return qualification;
		}


		public void setQualification(String qualification) {
			this.qualification = qualification;
		}


		public String getFaculty_address() {
			return faculty_address;
		}


		public void setFaculty_address(String faculty_address) {
			this.faculty_address = faculty_address;
		}


		public long getZipcode() {
			return zipcode;
		}


		public void setZipcode(long zipcode) {
			this.zipcode = zipcode;
		}
	
		public String getFaculty_courses() {
			return faculty_courses;
		}


		public void setFaculty_courses(String faculty_courses) {
			this.faculty_courses = faculty_courses;
		}

		public Faculty(int faculty_id) {
	        this.faculty_id = faculty_id;
	    }
}