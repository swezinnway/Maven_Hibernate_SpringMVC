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
import com.best.hibernate.exam.model.Teacher;
import com.best.hibernate.exam.service.DepartmentService;
import com.best.hibernate.exam.service.GradeService;
import com.best.hibernate.exam.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	DepartmentService departmentService;
	@Autowired
	TeacherService teacherService;
	@Autowired
	GradeService gradeService;
	@RequestMapping(value="/new_teacher.htm",method=RequestMethod.GET)
	public String createDepartment(Model model){
		model.addAttribute("departmentList", departmentService.getDepartmentList());
		model.addAttribute("gradeList", gradeService.getGradeList());
		model.addAttribute("teacher", new Teacher());
		return "New_Teacher";
	}
	
	@RequestMapping(value="/new_teacher.htm",method=RequestMethod.POST)
	public String saveCategory(@Valid @ModelAttribute(value="teacher") Teacher teacher,BindingResult br,Model model){
		
		 if(br.hasErrors())  
	        {  
			 model.addAttribute("departmentList", departmentService.getDepartmentList());
				model.addAttribute("gradeList", gradeService.getGradeList());
	            return "New_Teacher";  
	        }  
	        else  
	        {  
	        	try{
	        		teacherService.saveTeacher(teacher);
	    		}catch(Exception ex){
	    			
	    		}
	        return "redirect:/teacher_list.htm";  
	        }  
		
	}
	@RequestMapping(value="/teacher_list.htm")
	public String ShowTeacher(Model model) {
		model.addAttribute("teacherList", teacherService.getTeacherList());
		return "Teacher_List";
	}
}
