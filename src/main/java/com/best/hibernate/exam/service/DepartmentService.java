package com.best.hibernate.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.hibernate.exam.dao.DepartmentDao;
import com.best.hibernate.exam.model.Department;




@Service
@Transactional
public class DepartmentService {

	
	@Autowired
	DepartmentDao departmentDao;
	
	public void saveDepartment(Department department) throws Exception{
		try{
			departmentDao.saveDepartment(department);
			
		}catch(Exception ex){
			throw ex;
		}
	}
	public List<Department> getDepartmentList(){
		return departmentDao.getDepartmentList();
	}
	
	public void delete(Long id) {
		// TODO Auto-generated method stub
		departmentDao.delete(id);
	}
	
	public Department findById(Long id) {
		return departmentDao.findById(id);
	}
	
	public void updateSave(Department department) {
		Department dep = this.findById(department.getDepartmentId());
	
		dep.setDepartmentName(department.getDepartmentName());
	
		try {
			this.saveDepartment(dep);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
