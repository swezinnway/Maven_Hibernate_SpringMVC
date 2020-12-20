package com.best.hibernate.exam.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.hibernate.exam.model.Department;




@Repository
public class DepartmentDao {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	public void saveDepartment(Department department){
		getSesssion().save(department);
	}
	public List<Department> getDepartmentList(){
			
			Criteria cr=getSesssion().createCriteria(Department.class);
			return(List<Department>)cr.list();
		}
	public int delete(Long id) {
		// TODO Auto-generated method stub
		String hql = "DELETE FROM Department WHERE departmentId = :id";
		Query query=getSesssion().createQuery(hql);
		query.setParameter("id", id);
		return query.executeUpdate(); 
	}
	public Department findById(Long id) {
		String hql = "SELECT department FROM Department department WHERE departmentId=:id";
		Query query=getSesssion().createQuery(hql);
		query.setParameter("id", id);
		return (Department) query.uniqueResult();
	}
}
