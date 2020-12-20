package com.best.hibernate.exam.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity
public class Result implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long resultId;
	private String resultName;
	private Integer totalMark;
	
	public Result() {}
	
	@OneToOne
	@JoinColumn(name="answer_id")
	private Answer answers;
	
	
}
