package com.best.hibernate.exam.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class ExamType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long examTypeId;
	@NotEmpty(message="please enter ExamType name!!!!")
	private String examTypeName;
	
	@ManyToOne
	@JoinColumn(name="exam_id")
	private Exam exams;
	
	
	@OneToMany(mappedBy = "examTypes",targetEntity=Question.class, cascade = CascadeType.ALL)
	private Set<Question> questions;
	
	public ExamType() {}


	public Long getExamTypeId() {
		return examTypeId;
	}


	public void setExamTypeId(Long examTypeId) {
		this.examTypeId = examTypeId;
	}


	public String getExamTypeName() {
		return examTypeName;
	}


	public void setExamTypeName(String examTypeName) {
		this.examTypeName = examTypeName;
	}


	public Exam getExams() {
		return exams;
	}


	public void setExams(Exam exams) {
		this.exams = exams;
	}
}
