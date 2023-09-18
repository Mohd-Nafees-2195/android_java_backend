package com.User.Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Application.dao.FileModelDao;
import com.User.Application.model.DataFile;

@Service
public class FileDataService {

	@Autowired
	private FileModelDao fileMoledDao;
	
	public void uploadPdfData(DataFile fileData) {
		fileMoledDao.save(fileData);
	}
}
