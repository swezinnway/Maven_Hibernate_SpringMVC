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
public class Teacher implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long teacherId;
	@NotEmpty(message="please enter Teacher name!!!!")
	private String teacherName;
	@NotNull
	private String nrc;
	@NotNull
	private  String email;
	@NotNull
	private String phone;
	@NotNull
	private String gender;
	@NotNull
	private String address;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department departments;

	@OneToMany(mappedBy = "teachers",targetEntity=Exam.class, cascade = CascadeType.ALL)
	private Set<Exam> exams;
	
	@ManyToOne
	@JoinColumn(name="grade_id")
	private Grade grades;
	
	
	public Teacher() {}
	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDepartments() {
		return departments;
	}

	public Set<Exam> getExams() {
		return exams;
	}
	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}
	public Grade getGrades() {
		return grades;
	}
	public void setGrades(Grade grades) {
		this.grades = grades;
	}
	public void setDepartments(Department departments) {
		this.departments = departments;
	}
}
