package com.enroll.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity

public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int collegeId;
	
	private String collegeName;
	private String collegeLocation;
	private Long collegePhoneno;
	private String collegeEmail;
	
	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
	private List<Student> student;
}