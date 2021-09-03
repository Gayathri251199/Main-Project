package com.scube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scube.Bo.StudentBO;
import com.scube.dao.StudentDaoInterface;
import com.scube.vo.StudentVO;

@Service
@Transactional
public class StudentServiceImpl implements StudentServiceInterface {

	@Autowired
	StudentDaoInterface studentDaoInterface;

	public StudentBO createStudent(StudentBO studentbo) {
		// TODO Auto-generated method stub

		StudentVO studentvo=new StudentVO();

		studentvo.setStudentName(studentbo.getStudentName());
		studentvo.setStudentAddress(studentbo.getStudentAddress());
		studentvo.setGmailAddress(studentbo.getGmailAddress());
		studentvo.setDepartment(studentbo.getDepartment());
		studentvo.setDob(studentbo.getDob());
		studentvo.setCollege(studentbo.getCollege());
		studentvo.setMobileNumber(studentbo.getMobileNumber());
		studentvo.setState(studentbo.getState());
		studentvo.setCity(studentbo.getCity());

		studentvo=studentDaoInterface.createStudent(studentvo);

		return studentbo;
	}

	public List<StudentBO> viewstudent() {
		// TODO Auto-generated method stub

		List<StudentBO>studentbolist=new ArrayList<StudentBO>();
		studentbolist=studentDaoInterface.viewstudent();
		if(studentbolist.size()>0&&!studentbolist.isEmpty()) {
			System.out.println("view students");
		}
		return studentbolist;
	}

	public StudentBO editstudent(StudentBO studentbo) {
		// TODO Auto-generated method stub

		StudentVO studentvo=new StudentVO();

		studentvo.setStudentloginId(studentbo.getStudentloginId());
		studentvo.setStudentName(studentbo.getStudentName());
		studentvo.setStudentAddress(studentbo.getStudentAddress());
		studentvo.setGmailAddress(studentbo.getGmailAddress());
		studentvo.setDob(studentbo.getDob());
		studentvo.setCollege(studentbo.getCollege());
		studentvo.setDepartment(studentbo.getDepartment());
		studentvo.setState(studentbo.getState());
		studentvo.setCity(studentbo.getCity());
		studentvo.setMobileNumber(studentbo.getMobileNumber());


		studentvo=studentDaoInterface.editstudent(studentvo);


		if(null!=studentvo) {
			studentbo.setStudentloginId(studentvo.getStudentloginId());
		}		
		return studentbo;
	}

/*	public StudentBO existstudent(StudentBO studentbo) {
		// TODO Auto-generated method stub
		return null;
	}*/

	public StudentBO existstudent(String studentName, String gmailAddress) {
		// TODO Auto-generated method stub
		
		StudentVO studentvo=new StudentVO();
		StudentBO studentbo=new StudentBO();
		studentvo.setStudentName(studentName);
		studentvo.setGmailAddress(gmailAddress);
		studentvo=studentDaoInterface.isExist(studentvo);

		if(null!=studentvo) {
			studentbo.setStudentName(studentvo.getStudentName());
			studentbo.setGmailAddress(studentvo.getGmailAddress());
		}
		return studentbo;
	}

	public int deleteStudent(StudentBO studentBO) {
		// TODO Auto-generated method stub
		
		StudentVO studentvo=new StudentVO();
		studentvo.setStudentloginId(studentBO.getStudentloginId());
		studentvo=studentDaoInterface.deleteStudent(studentvo);
		if(null==studentvo) {
			
			System.out.println("delete");
			
		}
		return 0;
	}

	public List<StudentBO> searchStudent(StudentBO studentbo) {
		// TODO Auto-generated method stub
		
		return studentDaoInterface.searchStudent(studentbo);
	}





}
