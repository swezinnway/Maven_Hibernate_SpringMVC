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
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Exam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long examId;
	@NotEmpty(message="please enter Exam name!!!!")
	private String examName;
	@NotNull
	private Integer totalmark;
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private Teacher  teachers;

	@OneToMany(mappedBy = "exams",targetEntity=ExamType.class, cascade = CascadeType.ALL)
	private Set<ExamType> examTypes;

	
	
	public Exam() {}
	
	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public Teacher getTeachers() {
		return teachers;
	}

	public void setTeachers(Teacher teachers) {
		this.teachers = teachers;
	}

	public Set<ExamType> getExamTypes() {
		return examTypes;
	}

	public Integer getTotalmark() {
		return totalmark;
	}

	public void setTotalmark(Integer totalmark) {
		this.totalmark = totalmark;
	}

	public void setExamTypes(Set<ExamType> examTypes) {
		this.examTypes = examTypes;
	}
	
}
