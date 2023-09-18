package com.User.Application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "pdffiles_tbl")
public class PDFFileData {
	
	@Id   //This will create a primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pdf_id")
	private Integer pdfId;
	
	 @Lob
	 private byte[] data;
	 
	 @Column(name="pdfuser_id")
	 private Integer pdfUserId;
	 
	 @Column(name="visibility")
	 private Integer visibility;
	 
	 
	 public PDFFileData() {}

	public PDFFileData(Integer pdfId, byte[] data, Integer pdfUserId) {
		super();
		this.pdfId = pdfId;
		this.data = data;
		this.pdfUserId = pdfUserId;
		this.visibility=0;
	}
	

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Integer getPdfId() {
		return pdfId;
	}

	public void setPdfId(Integer pdfId) {
		this.pdfId = pdfId;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Integer getPdfUserId() {
		return pdfUserId;
	}

	public void setPdfUserId(Integer pdfUserId) {
		this.pdfUserId = pdfUserId;
	} 
}
