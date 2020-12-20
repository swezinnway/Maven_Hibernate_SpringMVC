package com.best.hibernate.exam.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.best.hibernate.exam.model.ExamType;

@Repository
public class ExamTypeDao {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	public void saveExamType(ExamType examType){
		getSesssion().save(examType);
	}
}
