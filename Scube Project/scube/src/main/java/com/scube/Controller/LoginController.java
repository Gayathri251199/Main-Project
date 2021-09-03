package com.scube.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scube.Bo.LoginBO;
import com.scube.service.LoginServicenterface;

@Controller
public class LoginController {

	@Autowired
	LoginServicenterface LoginServicenterface;


	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String Login(Model model) {

		
		LoginBO loginBO=new LoginBO();
		model.addAttribute("loginobj", loginBO);


		return "login";

	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String LoginPost(@Validated @ModelAttribute("loginobj")LoginBO loginbo,BindingResult result,HttpServletRequest req,HttpServletResponse response,Model model) {

		if(result.hasErrors()) {
			req.setAttribute("something went wrong", "errormsg");
			return "login";
		}
		
		if(null!=loginbo) {
			
			 loginbo=LoginServicenterface.loginPost(loginbo);
		if(null!=loginbo) {
			model.addAttribute("loginobj", loginbo);
			req.setAttribute("sucessmsg", "Inserted Sucessfully");
		}
		}
		
		return "login";
	}
}
