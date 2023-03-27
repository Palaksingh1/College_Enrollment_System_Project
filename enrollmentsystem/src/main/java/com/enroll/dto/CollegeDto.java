package com.enroll.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.enroll.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CollegeDto {
	
	@NotBlank(message = "Invalid College Name:Empty name")
	@NotNull(message = "Invalid college name:name is null")
	private String collegeName;
	
	@NotBlank(message = "Invalid location:Empty name")
	@NotNull(message = "Invalid location:name is null")
	private String collegeLocation;
	
	@NotBlank(message="Invalid Phone no:Empty Number")
	@NotNull(message="Invalid Name:number is Null")
	@Pattern(regexp="^\\d{10}$",message ="Invalid Phone number")
	private Long collegePhoneno;
	
	@Email(message="Invalid Name")
	private String collegeEmail;
	
	private List<Student> student;

}
