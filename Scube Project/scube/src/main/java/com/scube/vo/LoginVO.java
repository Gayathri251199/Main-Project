package com.scube.vo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="log_in_scube")
public class LoginVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loginId;
	
	private String emailAddrees;
	
	private String password;
	
	private String isDeleted;
	
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

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
