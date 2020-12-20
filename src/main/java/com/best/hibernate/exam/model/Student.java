package com.best.hibernate.exam.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	@NotEmpty(message="please enter Student name!!!!")
	private String studentName;
	@NotNull
	private String rollno;
	@NotNull
	private String nrc;
	@NotNull
	private String gender;
	@NotNull
	private String email;
	@NotNull
	private String phone;
	@NotNull
	private String address;
	
	@ManyToOne
	@JoinColumn(name="grade_id")
	private Grade grades;

	
	
	public Student() {}
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Grade getGrades() {
		return grades;
	}

	public void setGrades(Grade grades) {
		this.grades = grades;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
}
