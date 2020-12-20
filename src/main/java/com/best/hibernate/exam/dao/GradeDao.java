package com.best.hibernate.exam.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.hibernate.exam.model.Department;
import com.best.hibernate.exam.model.Grade;

@Repository
public class GradeDao {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	public void saveGrade(Grade grade){
		getSesssion().save(grade);
	}
	public List<Grade> getGradeList(){
		
		Criteria cr=getSesssion().createCriteria(Grade.class);
		return(List<Grade>)cr.list();
	}
}
