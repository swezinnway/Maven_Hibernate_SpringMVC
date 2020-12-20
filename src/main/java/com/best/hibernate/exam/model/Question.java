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
@Entity
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long questionId;
	private String questionName;
	private Integer mark;
	
	@ManyToOne
	@JoinColumn(name="examType_id")
	private ExamType examTypes;
	
	
	@OneToMany(mappedBy = "questions",targetEntity=Answer.class, cascade = CascadeType.ALL)
	private Set<Answer> answers;
	
	public Question() {}


	public Long getQuestionId() {
		return questionId;
	}


	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}


	public String getQuestionName() {
		return questionName;
	}


	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}


	public ExamType getExamTypes() {
		return examTypes;
	}


	public Integer getMark() {
		return mark;
	}


	public void setMark(Integer mark) {
		this.mark = mark;
	}


	public void setExamTypes(ExamType examTypes) {
		this.examTypes = examTypes;
	}
}
