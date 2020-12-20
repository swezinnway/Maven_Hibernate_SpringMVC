package com.best.hibernate.exam.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Answer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long answerId;
	private String answerName;
	private boolean status;

	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question questions;
	
	
	@OneToOne(mappedBy="answers",cascade=CascadeType.ALL)
	private Result results;
}
