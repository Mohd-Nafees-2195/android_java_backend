package com.User.Application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty_tbl")
public class FacultyData {
	
	@Id   //This will create a primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="faculty_id")
	private Integer facultyId;
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="department")
	private String department;
	
	@Column(name="mobileNumber")
	private String mobileNumber;
	
	@Column(name="role")
	private String role;
	
	private String email;
	private String examiner1Email;
	private String examiner2Email;
	private String imageURL;
	private String password;
	
	public FacultyData() {}

	public FacultyData(Integer facultyId, String fullName, String department, String mobileNumber, String role,
			String email, String examiner1Email, String examiner2Email, String imageURL, String password) {
		super();
		this.facultyId = facultyId;
		this.fullName = fullName;
		this.department = department;
		this.mobileNumber = mobileNumber;
		this.role = role;
		this.email = email;
		this.examiner1Email = examiner1Email;
		this.examiner2Email = examiner2Email;
		this.imageURL = imageURL;
		this.password = password;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExaminer1Email() {
		return examiner1Email;
	}

	public void setExaminer1Email(String examiner1Email) {
		this.examiner1Email = examiner1Email;
	}

	public String getExaminer2Email() {
		return examiner2Email;
	}

	public void setExaminer2Email(String examiner2Email) {
		this.examiner2Email = examiner2Email;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "FacultyData [facultyId=" + facultyId + ", fullName=" + fullName + ", department=" + department
				+ ", mobileNumber=" + mobileNumber + ", role=" + role + ", email=" + email + ", examiner1Email="
				+ examiner1Email + ", examiner2Email=" + examiner2Email + ", imageURL=" + imageURL + ", password="
				+ password + "]";
	}
	
	
	
//	public FacultyData(Integer facultyId, String full_name, String department, String mobile_number, String role,
//			String email, String examiner1Email, String examiner2Email, String imageURL, String password) {
//		super();
//		this.facultyId = facultyId;
//		this.full_name = full_name;
//		this.department = department;
//		this.mobile_number = mobile_number;
//		this.role = role;
//		this.email = email;
//		this.examiner1Email = examiner1Email;
//		this.examiner2Email = examiner2Email;
//		this.imageURL = imageURL;
//		this.password = password;
//	}
//
//	public Integer getFacultyId() {
//		return facultyId;
//	}
//
//	public void setFacultyId(Integer facultyId) {
//		this.facultyId = facultyId;
//	}
//
//	public String getFull_name() {
//		return full_name;
//	}
//
//	public void setFull_name(String full_name) {
//		this.full_name = full_name;
//	}
//
//	public String getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//
//	public String getMobile_number() {
//		return mobile_number;
//	}
//
//	public void setMobile_number(String mobile_number) {
//		this.mobile_number = mobile_number;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getExaminer1Email() {
//		return examiner1Email;
//	}
//
//	public void setExaminer1Email(String examiner1Email) {
//		this.examiner1Email = examiner1Email;
//	}
//
//	public String getExaminer2Email() {
//		return examiner2Email;
//	}
//
//	public void setExaminer2Email(String examiner2Email) {
//		this.examiner2Email = examiner2Email;
//	}
//
//	public String getImageURL() {
//		return imageURL;
//	}
//
//	public void setImageURL(String imageURL) {
//		this.imageURL = imageURL;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	@Override
//	public String toString() {
//		return "FacultyDetails [facultyId=" + facultyId + ", full_name=" + full_name + ", department=" + department
//				+ ", mobile_number=" + mobile_number + ", role=" + role + ", email=" + email + ", examiner1Email="
//				+ examiner1Email + ", examiner2Email=" + examiner2Email + ", imageURL=" + imageURL + ", password="
//				+ password + "]";
//	}
//	
}
