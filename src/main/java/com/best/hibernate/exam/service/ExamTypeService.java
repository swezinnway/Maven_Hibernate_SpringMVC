package com.best.hibernate.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.hibernate.exam.dao.ExamTypeDao;

import com.best.hibernate.exam.model.ExamType;

@Service
@Transactional
public class ExamTypeService {

	@Autowired
	ExamTypeDao examTypeDao;
	
	
	public void saveExamType(ExamType examType) throws Exception{
		try{
			examTypeDao.saveExamType(examType);
			
		}catch(Exception ex){
			throw ex;
		}
	}
}
