package com.scube.Bo;

import javax.validation.constraints.NotBlank;

public class LoginBO {

	private int loginId;
	@NotBlank(message="Must not be empty")
	private String emailAddrees;
	@NotBlank(message="Must not be empty")
	private String password;
	@NotBlank(message="May not be empty")
	private String studentName;
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getEmailAddrees() {
		return emailAddrees;
	}
	public void setEmailAddrees(String emailAddrees) {
		this.emailAddrees = emailAddrees;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
