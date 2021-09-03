package com.scube.dao;

import java.util.List;

import com.scube.Bo.StudentBO;
import com.scube.vo.StudentVO;

public interface StudentDaoInterface {

	StudentVO createStudent(StudentVO studentvo);

	List<StudentBO> viewstudent();

	StudentVO editstudent(StudentVO studentvo);

	StudentVO isExist(StudentVO studentvo);

	StudentVO deleteStudent(StudentVO studentvo);

	List<StudentBO> searchStudent(StudentBO studentbo);

	

	

}
