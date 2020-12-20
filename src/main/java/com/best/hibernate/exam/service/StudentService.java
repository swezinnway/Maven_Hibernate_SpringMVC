package com.best.hibernate.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.hibernate.exam.dao.StudentDao;
import com.best.hibernate.exam.model.Grade;
import com.best.hibernate.exam.model.Student;

@Service
@Transactional
public class StudentService {

	@Autowired
	StudentDao studentDao;
	public void saveStudent(Student student) throws Exception{
		try{
			studentDao.saveStudent(student);
			
		}catch(Exception ex){
			throw ex;
		}
	}
	public List<Student> getStudentList(){
		return studentDao.getstudentList();
	}
}
