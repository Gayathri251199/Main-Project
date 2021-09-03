package com.scube.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledDocument;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.fabric.xmlrpc.base.Array;
import com.scube.Bo.StudentBO;
import com.scube.vo.StudentVO;

@Repository
public class StudentDaoImpl implements StudentDaoInterface {

	@Autowired
	SessionFactory sessionfac;

	public StudentVO createStudent(StudentVO studentvo) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionfac.getCurrentSession();
			session.save(studentvo);
			if(0<studentvo.getStudentloginId()) {
				System.out.println(studentvo.getStudentloginId());			
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return studentvo;
	}

	public List<StudentBO> viewstudent() {
		// TODO Auto-generated method stub

		List<StudentVO>studentvolist=new ArrayList<StudentVO>();
		List<StudentBO>studentbolist=new ArrayList<StudentBO>();
		Session session=sessionfac.getCurrentSession();
		Criteria criteria=session.createCriteria(StudentVO.class);
		studentvolist=criteria.list();

		for (StudentVO studentvo : studentvolist) {
			StudentBO studentbo=new StudentBO();

			studentbo.setStudentloginId(studentvo.getStudentloginId());
			studentbo.setStudentName(studentvo.getStudentName());
			studentbo.setGmailAddress(studentvo.getGmailAddress());
			studentbo.setPassword(studentvo.getPassword());
			studentbo.setDob(studentvo.getDob());
			studentbo.setStudentAddress(studentvo.getStudentAddress());
			studentbo.setCollege(studentvo.getCollege());
			studentbo.setDepartment(studentvo.getDepartment());
			studentbo.setCity(studentvo.getCity());
			studentbo.setState(studentvo.getState());
			studentbo.setMobileNumber(studentvo.getMobileNumber());
			studentbolist.add(studentbo);
		}
		return studentbolist;
	}

	public StudentVO editstudent(StudentVO studentvo) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionfac.getCurrentSession();
			session.saveOrUpdate(studentvo);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return studentvo;
	}

	public StudentVO isExist(StudentVO studentvo) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionfac.getCurrentSession();
			Criteria criteria=session.createCriteria(StudentVO.class);
			criteria.add(Restrictions.eq("studentName",studentvo.getStudentName() ));
			criteria.add(Restrictions.eq("gmailAddress",studentvo.getGmailAddress()));
			studentvo=(StudentVO)criteria.uniqueResult();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return studentvo;
	}

	public StudentVO deleteStudent(StudentVO studentvo) {
		// TODO Auto-generated method stub

		try {
			Session session=sessionfac.getCurrentSession();
			session.delete(studentvo);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return studentvo;
	}

	public List<StudentBO> searchStudent(StudentBO studentbo) {
		// TODO Auto-generated method stub
		
		List<StudentVO> volist=new ArrayList<StudentVO>();
		List<StudentBO> bolist=new ArrayList<StudentBO>();
		try {
			
			Session session=sessionfac.getCurrentSession();
			Criteria criteria=session.createCriteria(StudentVO.class);
			if(null!=studentbo) {
			criteria.add(Restrictions.ilike("studentName", studentbo.getStudentName(),MatchMode.ANYWHERE));
			volist=criteria.list();
			}
			
			for (StudentVO studentvo : volist) {
				
				StudentBO studentBO2=new StudentBO();
				studentBO2.setStudentName(studentvo.getStudentName());
				studentBO2.setStudentAddress(studentvo.getStudentAddress());
				studentBO2.setGmailAddress(studentvo.getGmailAddress());
				studentBO2.setMobileNumber(studentvo.getMobileNumber());
				studentBO2.setCity(studentvo.getCity());
				studentBO2.setCollege(studentvo.getCollege());
				studentBO2.setDepartment(studentvo.getDepartment());
				studentBO2.setState(studentvo.getState());
				studentBO2.setDob(studentvo.getDob());
				
				bolist.add(studentBO2);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		return bolist;
	}
}
