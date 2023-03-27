package com.enroll;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.enroll.entity.College;
import com.enroll.entity.Student;
import com.enroll.repository.CollegeRepository;

@SpringBootApplication
public class EnrollmentsystemApplication implements CommandLineRunner{
	@Autowired
	private CollegeRepository collegeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EnrollmentsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		College c1=College.builder().collegeName("SND").collegeLocation("YEOLA")
				.collegePhoneno(123578926l).collegeEmail("snd@gmail.com").build();
		
		Student s1=Student.builder().studentName("Bruce Lee").studentEmail("blw@gmail.com")
				.studentMobile(7856904510l).studentAddress("Bangalore").build();
		Student s2=Student.builder().studentName("Marie").studentEmail("marp5@gmail.com")
				.studentMobile(9856967810l).studentAddress("Andaman").build();
		
		c1.setStudent(Arrays.asList(s1, s2));
		collegeRepository.save(c1);
				
//		collegeRepository.save(c1);
 	System.out.println("=============saved===================");
		
	}

}
