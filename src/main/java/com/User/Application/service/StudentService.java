package com.User.Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Application.dao.StudentDao;
import com.User.Application.model.StudentData;

@Service
public class StudentService {
	
	@Autowired 
	private StudentDao studentDao;

	//Retrieve Data from student_tbl Table
	public Iterable<StudentData> getAllStudents(){
		return studentDao.findAll();	
		//findAll()==> It Internally write => SELECT * FROM student_tbl and Transform the output into Iterable<StudentData>
	}
		
	//Retrieve specific student
	public StudentData getStudent(Integer studentId) {
		//findById() ==> SELECT * FROM student_tbl WHERE student_Id=studentId;
		return studentDao.findById(studentId).orElse(new StudentData());
	}
	
	//Inserting the records 
	public StudentData registerStudent(StudentData studentObj) {
		//save method is used to insert or update the records
		//Inserting the records when primary key is null or PK is not there in table 
		return studentDao.save(studentObj);
	}
	

	//Updating the email id 
	public StudentData updateStudent(Integer studentId,String newEmail) {
		StudentData dbStudentObject=getStudent(studentId);
		if(dbStudentObject!=null && dbStudentObject.getEmail()!=null) {
			dbStudentObject.setEmail(newEmail);
			return studentDao.save(dbStudentObject);
		}
		return null;
	}
	
	//Updating the email id 
		public StudentData updateStudentAll(Integer studentId,StudentData obj ) {
			StudentData dbStudentObject=getStudent(studentId);
			if(dbStudentObject!=null && dbStudentObject.getEmail()!=null) {
				dbStudentObject=obj;
				return studentDao.save(dbStudentObject);
			}
			return null;
		}
	
	//Updating the image 
		public StudentData updateStudentImage(Integer studentId,String imageURL) {
			StudentData dbStudentObject=getStudent(studentId);
			if(dbStudentObject!=null && dbStudentObject.getEmail()!=null) {
				dbStudentObject.setImageURL(imageURL);
				return studentDao.save(dbStudentObject);
			}
			return null;
		}

	
	//Deleting the records
		public void deleteStudent(Integer studentId) {
			studentDao.deleteById(studentId);
		}
		
//		public void deleteStudentByEmail(String email) {
//			studentDao.deleteByEmail(email);
//		}
		
}
