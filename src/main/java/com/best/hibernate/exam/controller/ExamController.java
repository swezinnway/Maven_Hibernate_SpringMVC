package com.best.hibernate.exam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.hibernate.exam.model.Department;
import com.best.hibernate.exam.model.Exam;

import com.best.hibernate.exam.service.ExamService;
import com.best.hibernate.exam.service.TeacherService;

@Controller
public class ExamController {
	@Autowired
	TeacherService teacherService;
	@Autowired
	ExamService examService;
	
	@RequestMapping(value="/new_exam.htm",method=RequestMethod.GET)
	public String createExam(Model model){
		model.addAttribute("teacherList", teacherService.getTeacherList());
		model.addAttribute("exam", new Exam());
		return "New_exam";
	}
	@RequestMapping(value="/new_exam.htm",method=RequestMethod.POST)
	public String saveExam(@Valid @ModelAttribute(value="exam") Exam exam ,BindingResult br){
		
		 if(br.hasErrors())  
	        {  
	            return "New_exam";  
	        }  
	        else  
	        {  
	        	try{
	        		examService.saveExam(exam);
	    		}catch(Exception ex){
	    			
	    		}
	        return "redirect:/exam_list.htm";  
	        }  
		
	}
	@RequestMapping(value="/exam_list.htm")
	public String ShowExam(Model model) {
		model.addAttribute("examList",examService.getExamList());
			return "Exam_List";
	}
	
	
}
