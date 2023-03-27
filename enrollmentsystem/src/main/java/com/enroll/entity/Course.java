package com.enroll.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity
@Table(name="Course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer courseId;
	private String courseName;
	private Long courseFees;
	private String courseDescription;
	private Integer seats;
//
//	

}