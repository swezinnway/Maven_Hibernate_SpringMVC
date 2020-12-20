package com.best.hibernate.exam.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Grade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long gradeId;
	@NotEmpty(message="please enter Grade name!!!!")
	private String gradeName;
	
	
	@OneToMany(mappedBy = "grades",targetEntity=Student.class, cascade = CascadeType.ALL)
	private Set<Student> students;

	
	@OneToMany(mappedBy = "grades",targetEntity=Teacher.class, cascade = CascadeType.ALL)
	private Set<Teacher> teachers;


	public Long getGradeId() {
		return gradeId;
	}


	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}


	public String getGradeName() {
		return gradeName;
	}


	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}


	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
