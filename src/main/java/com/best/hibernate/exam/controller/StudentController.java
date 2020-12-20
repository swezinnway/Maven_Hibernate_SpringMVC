package com.best.hibernate.exam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.hibernate.exam.model.Student;
import com.best.hibernate.exam.service.GradeService;
import com.best.hibernate.exam.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	GradeService gradeService;
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/new_student.hm",method=RequestMethod.GET)
	public String createStudent(Model model){
		model.addAttribute("gradeList", gradeService.getGradeList());
		model.addAttribute("student", new Student());
		return "New_Student";
	}
	@RequestMapping(value="/new_student.hm",method=RequestMethod.POST)
	public String saveStudent(@Valid @ModelAttribute(value="student") Student student,BindingResult br,Model model){
		
		 if(br.hasErrors())  
	        {  	
			 model.addAttribute("gradeList", gradeService.getGradeList());
	            return "New_Student";  
	        }  
	        else  
	        {  
	        	try{
	        		studentService.saveStudent(student);
	    		}catch(Exception ex){
	    			
	    		}
	        return "redirect:/student_list.htm";  
	        }  
		
	}
	@RequestMapping(value="/student_list.htm")
	public String ShowStudent(Model model) {
		model.addAttribute("studentList",studentService.getStudentList());
		return "Student_List";
	}
}
