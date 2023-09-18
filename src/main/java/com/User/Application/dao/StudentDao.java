package com.User.Application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.User.Application.model.StudentData;

@Repository
public interface StudentDao extends CrudRepository<StudentData,Integer> {

}
