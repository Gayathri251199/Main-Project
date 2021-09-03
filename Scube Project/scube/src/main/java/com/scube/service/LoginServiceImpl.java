package com.scube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scube.Bo.LoginBO;
import com.scube.dao.LoginDaoInterface;
import com.scube.vo.LoginVO;

@Service
@Transactional
public class LoginServiceImpl implements LoginServicenterface {

	@Autowired
	LoginDaoInterface logindaointerface;
	
	public LoginBO loginPost(LoginBO loginbo) {
		// TODO Auto-generated method stub
		
		LoginVO loginVO=new LoginVO();
		loginVO.setEmailAddrees(loginbo.getEmailAddrees());
		loginVO.setPassword(loginbo.getPassword());
		loginVO.setStudentName(loginbo.getStudentName());
		loginVO.setIsDeleted("false");
		loginVO=logindaointerface.loginPost(loginVO);
		
		if(null!=loginVO) {
			
			System.out.println("login sucessfully");
			
		}
		
		return loginbo;
	}

	
	
}
