package com.User.Application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.User.Application.model.DataFile;

@Repository
public interface FileModelDao extends CrudRepository<DataFile,Integer> {
}
