package com.scube.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scube.vo.LoginVO;

@Repository
public class LoginDaoImpl implements LoginDaoInterface {

	@Autowired
	SessionFactory sessionFactory;

	public LoginVO loginPost(LoginVO loginVO) {
		// TODO Auto-generated method stub

		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(loginVO);
			if(0<loginVO.getLoginId()) {

				System.out.println(loginVO.getLoginId());

			}	
		}
		catch (Exception e) {
			// TODO: handle exception

			System.out.println(e);
		}

		return loginVO;
	}




}
