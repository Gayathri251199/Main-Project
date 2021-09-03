package com.scube.service;

import java.util.List;

import com.scube.Bo.StudentBO;

public interface StudentServiceInterface {

	StudentBO createStudent(StudentBO studentbo);

	List<StudentBO> viewstudent();

	StudentBO editstudent(StudentBO studentbo);

	/*StudentBO existstudent(StudentBO studentbo);*/

	StudentBO existstudent(String studentName, String gmailAddress);

	int deleteStudent(StudentBO studentBO);

	List<StudentBO> searchStudent(StudentBO studentbo);



	

	

}
