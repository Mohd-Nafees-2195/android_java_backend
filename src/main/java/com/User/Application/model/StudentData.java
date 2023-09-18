package com.User.Application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_tbl")
public class StudentData {

	@Id   //This will create a primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private Integer studentId;
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="rollNumber")
	private String rollNumber;
	
	@Column(name="mobileNumber")
	private String mobileNumber;
	
	@Column(name="course")
	private String course;
	
	private String email;
	private String guideEmail;
	private String examiner1Email;
	private String examiner2Email;
	private String imageURL;
	private String password;
	private String timeDuration;
	
	public StudentData() {}

	public StudentData(Integer studentId, String fullName, String rollNumber, String mobileNumber, String course,
			String email, String guideEmail, String examiner1Email, String examiner2Email, String imageURL,
			String password, String timeDuration) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.rollNumber = rollNumber;
		this.mobileNumber = mobileNumber;
		this.course = course;
		this.email = email;
		this.guideEmail = guideEmail;
		this.examiner1Email = examiner1Email;
		this.examiner2Email = examiner2Email;
		this.imageURL = imageURL;
		this.password = password;
		this.timeDuration = timeDuration;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGuideEmail() {
		return guideEmail;
	}

	public void setGuideEmail(String guideEmail) {
		this.guideEmail = guideEmail;
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

	public String getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}

	@Override
	public String toString() {
		return "StudentData [studentId=" + studentId + ", fullName=" + fullName + ", rollNumber=" + rollNumber
				+ ", mobileNumber=" + mobileNumber + ", course=" + course + ", email=" + email + ", guideEmail="
				+ guideEmail + ", examiner1Email=" + examiner1Email + ", examiner2Email=" + examiner2Email
				+ ", imageURL=" + imageURL + ", password=" + password + ", timeDuration=" + timeDuration + "]";
	}
	
	
	
//	public StudentData(String course, String email,String examiner1Email,String examiner2Email, String full_name,String guideEmail,String imageURL,String mobile_number,String password, String roll_number,  
//			 String timeDuration,Integer studentId) {
//		super();
//		this.studentId = studentId;
//		this.fullName = fullName;
//		this.rollNumber = rollNumber;
//		this.mobileNumber = mobileNumber;
//		this.course = course;
//		this.email = email;
//		this.guideEmail = guideEmail;
//		this.examiner1Email = examiner1Email;
//		this.examiner2Email = examiner2Email;
//		this.imageURL = imageURL;
//		this.password = password;
//		this.timeDuration = timeDuration;
//	}
//
//	public Integer getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(Integer studentId) {
//		this.studentId = studentId;
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
//	public String getRoll_number() {
//		return roll_number;
//	}
//
//	public void setRoll_number(String roll_number) {
//		this.roll_number = roll_number;
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
//	public String getCourse() {
//		return course;
//	}
//
//	public void setCourse(String course) {
//		this.course = course;
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
//	public String getGuideEmail() {
//		return guideEmail;
//	}
//
//	public void setGuideEmail(String guideEmail) {
//		this.guideEmail = guideEmail;
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
//	public String getTimeDuration() {
//		return timeDuration;
//	}
//
//	public void setTimeDuration(String timeDuration) {
//		this.timeDuration = timeDuration;
//	}
//
//	@Override
//	public String toString() {
//		return "StudentData [studentId=" + studentId + ", full_name=" + full_name + ", roll_number=" + roll_number
//				+ ", mobile_number=" + mobile_number + ", course=" + course + ", email=" + email + ", guideEmail="
//				+ guideEmail + ", examiner1Email=" + examiner1Email + ", examiner2Email=" + examiner2Email
//				+ ", imageURL=" + imageURL + ", password=" + password + ", timeDuration=" + timeDuration + "]";
//	}
	
	
	
}
