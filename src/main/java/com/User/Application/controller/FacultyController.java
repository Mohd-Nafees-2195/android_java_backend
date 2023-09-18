package com.User.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.Application.model.FacultyData;
import com.User.Application.model.StudentData;
import com.User.Application.service.FacultyService;

@RestController
@RequestMapping(value="/faculties")
public class FacultyController {

	@Autowired
	private FacultyService facultyService;
	
	//Retrieve all faculties
	@GetMapping(value="/") 
	public Iterable<FacultyData> getAllFaculty(){
		return facultyService.getAllFaculty();
	}
		
		//Retrieve Single Faculty
		@GetMapping(value="/{facultyId}")  //http://localhost:8080/faculties/perticular facultyId
		//http://localhost:8080/1
		//http://localhost:8080/2
		//{} ==>Handles Dynamic values
		public FacultyData getFaculty(@PathVariable("facultyId") Integer facultyId) {
			return facultyService.getFaculty(facultyId);
		}
		
		//Register Faculty
			@PostMapping(value="/registerFaculty") //@Post + @RequestMapping
			//http://localhost:8080/registerFaculty
			public FacultyData registerFaculty(@RequestBody FacultyData facultyObj){
				return facultyService.registerFaculty(facultyObj);
			}
			
			//Update Faculty
			@PutMapping(value="/{facultyId}/{newEmail}") //@PutMapping = @put + @RequestMapping
			//http://localhost:808/1/abcd@gmail.com
			public FacultyData updateFaculty(@PathVariable("facultyId") Integer facultyId,@PathVariable("newEmail") String newEmail) {
				return facultyService.updateFaculty(facultyId, newEmail);
			}
			
			@PutMapping(value="/updateAll/{facultyId}") //@PutMapping = @put + @RequestMapping
			//http://localhost:808/1/abcd@gmail.com
			public FacultyData updateFacultyAll(@PathVariable("facultyId") Integer facultyId,@RequestBody FacultyData data) {
				return facultyService.updateFacultyAll(facultyId, data);
			}
			
			//Delete Object
			@DeleteMapping(value="/{facultyId}")
			public void deleteFaculty(@PathVariable Integer facultyId) {
				facultyService.deleteFaculty(facultyId);
			}
}
