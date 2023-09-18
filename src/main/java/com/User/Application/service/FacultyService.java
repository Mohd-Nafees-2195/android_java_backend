package com.User.Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Application.dao.FacultyDao;
import com.User.Application.model.FacultyData;
import com.User.Application.model.StudentData;

@Service
public class FacultyService {

	@Autowired 
	private FacultyDao facultyDao;
	
	//Retrieve Data from faculty_tbl Table
		public Iterable<FacultyData> getAllFaculty(){
			return facultyDao.findAll();	
			//findAll()==> It Internally write => SELECT * FROM faculty_tbl and Transform the output into Iterable<StudentData>
		}
			
		//Retrieve specific faculty
		public FacultyData getFaculty(Integer facultyId) {
			//findById() ==> SELECT * FROM faculty_tbl WHERE faculty_Id=facultyId;
			return facultyDao.findById(facultyId).orElse(new FacultyData());
		}
		
		//Inserting the records 
		public FacultyData registerFaculty(FacultyData facultyObj) {
			//save method is used to insert or update the records
			//Inserting the records when primary key is null or PK is not there in table 
			return facultyDao.save(facultyObj);
		}
		

		//Updating the email id 
		public FacultyData updateFaculty(Integer facultyId,String newEmail) {
			FacultyData dbFacultyObject=getFaculty(facultyId);
			if(dbFacultyObject!=null && dbFacultyObject.getEmail()!=null) {
				dbFacultyObject.setEmail(newEmail);
				return facultyDao.save(dbFacultyObject);
			}
			return null;
		}
		
		//Updating the update All Records/object 
				public FacultyData updateFacultyAll(Integer facultyId,FacultyData obj ) {
					FacultyData dbFacultyObject=getFaculty(facultyId);
					if(dbFacultyObject!=null) {
						dbFacultyObject=obj;
						return facultyDao.save(dbFacultyObject);
					}
					return null;
				}
		
		//Deleting the records
			public void deleteFaculty(Integer facultyId) {
				facultyDao.deleteById(facultyId);
			}
}
