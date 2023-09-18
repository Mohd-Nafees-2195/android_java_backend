package com.User.Application.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.User.Application.model.PDFFileData;
import com.User.Application.service.PdfUploadService;

@RestController
@RequestMapping(value="/uploads")
public class FileUploadController {

	@Autowired
	private PdfUploadService pdfUploadservice;
	
	//Uploading file
	@PostMapping("/{pdfUserId}")
    public ResponseEntity<String> uploadPDFFile(@PathVariable("pdfUserId") Integer pdfUserId,@RequestParam("file") MultipartFile file) {
        try {
            byte[] fileData = file.getBytes();
            PDFFileData pdfFileData = new PDFFileData();
            pdfFileData.setData(fileData);
            pdfFileData.setPdfUserId(pdfUserId);
            pdfFileData.setVisibility(0);
            pdfUploadservice.uploadPdfFile(pdfFileData);
            return ResponseEntity.ok("File uploaded successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file");
        }
    }
	
}
