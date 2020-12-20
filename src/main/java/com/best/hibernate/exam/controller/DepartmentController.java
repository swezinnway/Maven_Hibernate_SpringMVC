package com.best.hibernate.exam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.hibernate.exam.model.Department;
import com.best.hibernate.exam.service.DepartmentService;




@Controller
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value="/new_department.htm",method=RequestMethod.GET)
	public String createDepartment(Model model){
		model.addAttribute("department", new Department());
		return "New_department";
	}
	
	@RequestMapping(value="/new_department.htm",method=RequestMethod.POST)
	public String saveCategory(@Valid @ModelAttribute(value="department") Department department,BindingResult br){
		
		 if(br.hasErrors())  
	        {  
	            return "New_department";  
	        }  
	        else  
	        {  
	        	try{
	        		departmentService.saveDepartment(department);
	    		}catch(Exception ex){
	    			
	    		}
	        return "redirect:/department_list.htm";  
	        }  
		
	}
	
	@RequestMapping(value="/department_list.htm")
	public String ShowDepartment(Model model) {
		model.addAttribute("departmentList", departmentService.getDepartmentList());
		return "Department_List";
	}
	
	@RequestMapping(value="/deleteDep/{id}")
	public String deleteDepartment(@PathVariable Long id) {
		departmentService.delete(id);
		
	    return "redirect:/department_list.htm";       
	}
	
	@RequestMapping(value="/editDep/{id}",method=RequestMethod.GET)
	public String editDepartmet(@PathVariable Long id,Model model) {
	
	Department dep=departmentService.findById(id);
	
		model.addAttribute("department", dep);
		System.out.println("---------is -----"+ dep.getDepartmentName());
		
		
	    return "edit_Department";       
	}
	@RequestMapping(value="/editDep/{id}",method=RequestMethod.POST)
	public String updateDepartment(@ModelAttribute(value="department") Department department) throws Exception {
		
		departmentService.updateSave(department);
		
		return"redirect:/department_list.htm";
	}
}
