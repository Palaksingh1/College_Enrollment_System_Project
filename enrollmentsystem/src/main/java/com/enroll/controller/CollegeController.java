package com.enroll.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enroll.dto.CollegeDto;
import com.enroll.entity.College;

import com.enroll.service.CollegeService;


@RestController
@RequestMapping("/api")
public class CollegeController {
	 @Autowired
	    private CollegeService collegeService;
	 
	//create a new enrollment
		@PostMapping(value = "/college")
		public  ResponseEntity<College> createCollege(@RequestBody @Valid CollegeDto collegedto) {
			return new ResponseEntity<>(collegeService.createCollege(collegedto),HttpStatus.CREATED);

		}
		
		// get all existing enrollment
			@GetMapping("/college")
			public List<College> getAll() {
				return collegeService.getAllCollege();

			}
			// Get a enrollment

			@GetMapping(value = "/college/{collegeId}")
			public College getCollege(@PathVariable int collegeId) {
				return collegeService.getCollegeById(collegeId);
			}

			// Update enrollment

			@PutMapping(value = "/college/{collegeId}")
			public College updateCollege(@PathVariable int collegeId, @RequestBody College college) {
				return collegeService.updateCollegeById(college, collegeId);
			}
			
			//delete enrollment

			@DeleteMapping(value = "/college/{collegeId}")
			public String deleteCollege(@PathVariable int collegeId) {
				return collegeService.deleteCollegeById(collegeId);
			}
			
	    
	   
}
