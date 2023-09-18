package com.User.Application.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.Application.model.DataFile;
import com.User.Application.service.FileDataService;


@RestController
@RequestMapping(value="/uploadurl")
public class FileDataController {
	
	@Autowired
	private FileDataService fileDataService;
	
	//Uploading file
		@PostMapping("/{pdfUserId}/{url}")
	    public void uploadPDFFile(@PathVariable("pdfUserId") Integer pdfUserId,@PathVariable("url") String url) {
	         
	        	DataFile fileData=new DataFile();
	        	fileData.setPdfUserId(pdfUserId);
	        	fileData.setVisibility(0);
	        	fileData.setUrl(url);
	        	//fileData.setUrl("https://m/v0/b/mtech-project-117d7.appspot.com/o/Uploads%2F1685685361565.pdf?alt=media&token=84981ea4-9afd-4f8c-8cc9-dab3f106ed62");
	            fileDataService.uploadPdfData(fileData);
	    }

}
