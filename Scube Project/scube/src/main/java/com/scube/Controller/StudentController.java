package com.scube.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.StyledDocument;
import javax.validation.Valid;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scube.Bo.StudentBO;
import com.scube.dao.StudentDaoInterface;
import com.scube.service.StudentServiceInterface;

@Controller
public class StudentController {

	@Autowired
	StudentServiceInterface studentservice;

	List<StudentBO>studentlist=new ArrayList<StudentBO>();

	@RequestMapping(value="create_student",method=RequestMethod.GET)
	public String createstudent(Model model) {

		StudentBO studentobj=new StudentBO();
		model.addAttribute("studentobj", studentobj);

		return "create_student";
	}

	@RequestMapping(value="/view_student",method=RequestMethod.GET)
	public String viewstudent(Model model,HttpServletRequest request,HttpServletResponse response) {

		studentlist=studentservice.viewstudent();
		model.addAttribute("studentlistobj", studentlist);
		model.addAttribute("searchobj", new StudentBO());
		return "view_student";
	}


	@RequestMapping(value="/edit_student",method=RequestMethod.GET)
	public String editstudent(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam("id")int id) {

		for (StudentBO studentBO : studentlist) {
			if(id==studentBO.getStudentloginId()) {
				model.addAttribute("editobj", studentBO);
			}
		}

		return "edit_student";
	}

	@RequestMapping(value="/create_student",method=RequestMethod.POST)
	public String createStudent(Model model,@Valid @ModelAttribute("studentobj") StudentBO studentbo, BindingResult result,HttpServletRequest request,HttpServletResponse response) {

		if(result.hasErrors()) {

			return "create_student";

		}

		StudentBO bo=new StudentBO();
		String studentName=request.getParameter("studentName");
		String gmailAddress=request.getParameter("gmailAddress");

		bo=studentservice.existstudent(studentName,gmailAddress);

		if(null!=bo.getStudentName()&&null!=bo.getGmailAddress()) {
			request.setAttribute("errormessage","Account is already exixts");
			return "create_student";
		}

		studentbo=studentservice.createStudent(studentbo);

		if(null!=studentbo) {						
			model.addAttribute("studentobj",studentbo);
		}
		return "redirect:/view_student";
	}

	@RequestMapping(value="/edit_student",method=RequestMethod.POST)
	public String editStudent(@Valid@ModelAttribute("editobj")StudentBO studentbo,BindingResult result,HttpServletResponse response,HttpServletRequest request,Model model) {

		if(result.hasErrors()) {

			return "edit_student";
		}		
		if(null!=studentbo) {
			studentbo=studentservice.editstudent(studentbo);
		}

		if(null!=studentbo) {

			model.addAttribute("editobj", studentbo);
		}

		return "redirect:/view_student";
	}

	@RequestMapping(value="/delete_student",method=RequestMethod.GET)
	public String deleteStudent(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam("id")int id) {

		String studentId=request.getParameter("studentloginId");
		if(null!=studentId) {

			id=Integer.parseInt(studentId);		
		}
		StudentBO studentBO=new StudentBO();
		studentBO.setStudentloginId(id);
		int stddid=studentservice.deleteStudent(studentBO);


		return "redirect:/view_student";

	}

	@RequestMapping(value="/search_student",method=RequestMethod.POST)
	public String searchStudent(Model model,@ModelAttribute("searchobj")StudentBO studentbo,BindingResult result,HttpServletRequest request,HttpServletResponse response) {

		List<StudentBO> studentbolist=new ArrayList<StudentBO>();


		if(result.hasErrors()) {

			return "view_student";
		}

		if(null!=studentbo) {  
			
			studentbolist=studentservice.searchStudent(studentbo);
			if(0<studentbolist.size()&&!studentbolist.isEmpty()) {		
				model.addAttribute("studentlistobj", studentbolist);	
				model.addAttribute("searchobj", studentbo);
			}

		}	
		return "view_student";
	}

}
