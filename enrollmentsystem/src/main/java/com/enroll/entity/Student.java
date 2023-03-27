package com.enroll.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer studentId;
	
	@Column(name="studentName" ,length=30)
	private String studentName;
	
	@Column(name="studentEmail",length=30)
	private String studentEmail;
	
	@Column(name="studentMobile",length=10)
	private Long studentMobile;
	
	@Column(name="studentAddress",length=50)
	private String studentAddress;
	
	@ManyToOne
	@JoinColumn(name = "collegeId")
	@JsonBackReference
	private College college;

}
