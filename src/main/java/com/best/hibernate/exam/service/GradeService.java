package com.best.hibernate.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.hibernate.exam.dao.GradeDao;
import com.best.hibernate.exam.model.Department;
import com.best.hibernate.exam.model.Grade;

@Service
@Transactional
public class GradeService {

	@Autowired
	GradeDao gradeDao;
	public void saveaGrade(Grade grade) throws Exception{
		try{
			gradeDao.saveGrade(grade);
			
		}catch(Exception ex){
			throw ex;
		}
	}
	public List<Grade> getGradeList(){
		return gradeDao.getGradeList();
	}
	
}
