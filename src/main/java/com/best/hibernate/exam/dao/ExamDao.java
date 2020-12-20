package com.best.hibernate.exam.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.hibernate.exam.model.Department;
import com.best.hibernate.exam.model.Exam;
@Repository
public class ExamDao {

	
	@Autowired
	SessionFactory sessionFactory;

	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	public void saveExam(Exam exam){
		getSesssion().save(exam);
	}
	public List<Exam> getExamList(){
		
		Criteria cr=getSesssion().createCriteria(Exam.class);
		return(List<Exam>)cr.list();
	}
}
