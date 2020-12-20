package com.best.hibernate.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.hibernate.exam.dao.TeacherDao;
import com.best.hibernate.exam.model.Department;
import com.best.hibernate.exam.model.Teacher;

@Service
@Transactional
public class TeacherService {

	
	@Autowired
	TeacherDao teacherDao;
	public void saveTeacher(Teacher teacher) throws Exception{
		try{
			teacherDao.saveTeacher(teacher);
			
		}catch(Exception ex){
			throw ex;
		}
	}
	public List<Teacher> getTeacherList(){
		return teacherDao.getTeacherList();
	}
}
