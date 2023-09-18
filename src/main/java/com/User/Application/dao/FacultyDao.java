package com.User.Application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.User.Application.model.FacultyData;

@Repository
public interface FacultyDao  extends CrudRepository<FacultyData,Integer> {

//  private void deleteByEmail(String email) {
//	  String query="DETETE From springserverdb.student_tbl WHERE email='email'";
//  }
	 
  
}
