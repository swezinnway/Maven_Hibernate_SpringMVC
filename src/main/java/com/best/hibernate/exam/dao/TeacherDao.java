package com.best.hibernate.exam.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.hibernate.exam.model.Department;
import com.best.hibernate.exam.model.Teacher;

@Repository
public class TeacherDao {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	public void saveTeacher(Teacher teacher){
		getSesssion().save(teacher);
	}
	public List<Teacher> getTeacherList(){
		
		Criteria cr=getSesssion().createCriteria(Teacher.class);
		return(List<Teacher>)cr.list();
	}
}
