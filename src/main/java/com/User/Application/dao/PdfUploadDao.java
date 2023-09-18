package com.User.Application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.User.Application.model.PDFFileData;

@Repository
public interface PdfUploadDao extends CrudRepository<PDFFileData,Integer> {

}
