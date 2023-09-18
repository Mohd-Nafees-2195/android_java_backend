package com.User.Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Application.dao.PdfUploadDao;
import com.User.Application.model.PDFFileData;

@Service
public class PdfUploadService {
 
	@Autowired
	private PdfUploadDao pdfUploadDao;
	
	public void uploadPdfFile(PDFFileData fileData) {
		pdfUploadDao.save(fileData);
	}
}
