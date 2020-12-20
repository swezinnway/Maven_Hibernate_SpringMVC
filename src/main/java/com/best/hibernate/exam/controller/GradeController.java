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
import com.best.hibernate.exam.model.Grade;
import com.best.hibernate.exam.service.GradeService;

@Controller
public class GradeController {
@Autowired
GradeService gradeService;
	
	@RequestMapping(value="/new_grade.htm",method=RequestMethod.GET)
	public String createGrade(Model model){
		model.addAttribute("grade", new Grade());
		return "New_Grade";
	}

	@RequestMapping(value="/new_grade.htm",method=RequestMethod.POST)
	public String saveGrade(@Valid @ModelAttribute(value="grade") Grade grade,BindingResult br){
		
		 if(br.hasErrors())  
	        {  
	            return "New_Grade";  
	        }  
	        else  
	        {  
	        	try{
	        		gradeService.saveaGrade(grade);
	    		}catch(Exception ex){
	    			
	    		}
	        return "redirect:/grade_list.htm";  
	        }  
		
	}
	@RequestMapping(value="/grade_list.htm")
	public String ShowGrade(Model model) {
		model.addAttribute("gradeList", gradeService.getGradeList());
		return "Grade_List";
	}
}
