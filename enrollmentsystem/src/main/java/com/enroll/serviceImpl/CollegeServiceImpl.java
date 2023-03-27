package com.enroll.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enroll.dto.CollegeDto;
import com.enroll.entity.College;

import com.enroll.repository.CollegeRepository;

import com.enroll.service.CollegeService;
@Service
public class CollegeServiceImpl implements CollegeService {
@Autowired 
 private CollegeRepository collegeRepository;
	@Override
	public College createCollege(CollegeDto collegedto) {
		// TODO Auto-generated method stub
		College college = College.builder().collegeName(collegedto.getCollegeName())
				.collegePhoneno(collegedto.getCollegePhoneno())
				.collegeLocation(collegedto.getCollegeLocation())
				.collegeEmail(collegedto.getCollegeEmail())
				.student(collegedto.getStudent()).build();
		return collegeRepository.save(college);
	}

	@Override
	public List<College> getAllCollege() {
		// TODO Auto-generated method stub
		return collegeRepository.findAll();
	}

	@Override
	public College getCollegeById(Integer collegeId) {
		// TODO Auto-generated method stub
		return collegeRepository.findById(collegeId).get();
	}

	@Override
	public College updateCollegeById(College college, int collegeId) {
		// TODO Auto-generated method stub
		College _college=collegeRepository.findById(collegeId).get();
		_college.setCollegeName(college.getCollegeName());
		_college.setCollegeLocation(college.getCollegeLocation());
		_college.setCollegePhoneno(college.getCollegePhoneno());
		_college.setCollegeEmail(college.getCollegeEmail());
		return collegeRepository.save(_college);
	}

	@Override
	public String deleteCollegeById(Integer collegeId) {
		// TODO Auto-generated method stub
         collegeRepository.findById(collegeId);
		
		return "The college is deleted";
	}

}
