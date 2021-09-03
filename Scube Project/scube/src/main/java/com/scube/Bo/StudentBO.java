package com.scube.Bo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StudentBO {

	private int studentloginId;	
	@NotBlank(message="Must Not be empty")
	private String studentName;	
	private String StudentAddress;
	@NotBlank(message="Must Not be empty")
	private String gmailAddress;
	private String password;
	@NotBlank(message="Must Not be empty")
	private String dob;	
	private String college;
	private String department;
	private long mobileNumber;
	private String city;
	private String state;
	
	public int getStudentloginId() {
		return studentloginId;
	}
	public void setStudentloginId(int studentloginId) {
		this.studentloginId = studentloginId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public String getGmailAddress() {
		return gmailAddress;
	}
	public void setGmailAddress(String gmailAddress) {
		this.gmailAddress = gmailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
