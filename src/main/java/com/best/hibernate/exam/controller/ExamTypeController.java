package com.best.hibernate.exam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.best.hibernate.exam.model.ExamType;
import com.best.hibernate.exam.service.ExamService;
import com.best.hibernate.exam.service.ExamTypeService;

@Controller
public class ExamTypeController {

	@Autowired
	ExamService examService;
	@Autowired
	ExamTypeService examTypeService;
	
	
	@RequestMapping(value="/new_examType.htm",method=RequestMethod.GET)
	public String createExamType(Model model){
		model.addAttribute("examList",examService.getExamList());
		model.addAttribute("extype", new ExamType());
		return "New_ExamType";
	}
	
	@RequestMapping(value="/new_examType.htm",method=RequestMethod.POST)
	public String saveCategory(@Valid @ModelAttribute(value="extype") ExamType examType,BindingResult br,Model model){
		
		 if(br.hasErrors())  
	        {  model.addAttribute("examList",examService.getExamList());
	            return "New_ExamType";  
	        }  
	        else  
	        {  
	        	try{
	        		examTypeService.saveExamType(examType);
	    		}catch(Exception ex){
	    			
	    		}
	        return "redirect:/ExamType_list.htm";  
	        }  
		
	}
	
}
