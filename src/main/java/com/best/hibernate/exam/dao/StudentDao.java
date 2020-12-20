package com.best.hibernate.exam.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.hibernate.exam.model.Grade;
import com.best.hibernate.exam.model.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	public void saveStudent(Student student){
		getSesssion().save(student);
	}
public List<Student> getstudentList(){
		
		Criteria cr=getSesssion().createCriteria(Student.class);
		return(List<Student>)cr.list();
	}
}
