package com.best.hibernate.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.hibernate.exam.dao.ExamDao;

import com.best.hibernate.exam.model.Exam;
@Service
@Transactional
public class ExamService {

	@Autowired
	ExamDao examDao;
	
	@Transactional
	public void saveExam(Exam exam) throws Exception{
		try{
			examDao.saveExam(exam);
			
		}catch(Exception ex){
			throw ex;
		}
	}
	public List<Exam> getExamList(){
		return examDao.getExamList();
	}
	
}
