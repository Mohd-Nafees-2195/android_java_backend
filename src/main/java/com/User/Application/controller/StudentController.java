package com.User.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.User.Application.model.StudentData;
import com.User.Application.service.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//Retrieve all students
	@GetMapping(value="/") 
	public Iterable<StudentData> getAllStudent(){
		return studentService.getAllStudents();
	}
	
	//Retrieve Single student
	@GetMapping(value="/{studentId}")  //http://localhost:8080/students/perticular studentId
	//http://localhost:8080/1
	//http://localhost:8080/2
	//{} ==>Handles Dynamic values
	public StudentData getStudent(@PathVariable("studentId") Integer studentId) {
		return studentService.getStudent(studentId);
	}
	
	//Register Student
		@PostMapping(value="/registerStudent") //@Post + @RequestMapping
		//http://localhost:8080/registerStuent
		public StudentData registerStudent(@RequestBody StudentData studentObj){
			return studentService.registerStudent(studentObj);
		}
		
		//Update Student
		@PutMapping(value="/{studentId}/{newEmail}") //@PutMapping = @put + @RequestMapping
		//http://localhost:808/1/abcd@gmail.com
		public StudentData updateStudent(@PathVariable("studentId") Integer studentId,@PathVariable("newEmail") String newEmail) {
			return studentService.updateStudent(studentId, newEmail);
		}
		
		@PutMapping(value="/{studentId}/{imageURL}") //@PutMapping = @put + @RequestMapping
		//http://localhost:808/1/abcd@gmail.com
		public StudentData updateStudentImage(@PathVariable("studentId") Integer studentId,@PathVariable("imageURL") String imageURL) {
			return studentService.updateStudentImage(studentId, imageURL);
		}
		
		@PutMapping(value="/updateAll/{studentId}") //@PutMapping = @put + @RequestMapping
		//http://localhost:808/1/abcd@gmail.com
		public StudentData updateStudentAll(@PathVariable("studentId") Integer studentId,@RequestBody StudentData data) {
			return studentService.updateStudentAll(studentId, data);
		}
		
		//Delete Object
		@DeleteMapping(value="/{studentId}")
		public void deleteStudent(@PathVariable Integer studentId) {
			studentService.deleteStudent(studentId);
		}
}
