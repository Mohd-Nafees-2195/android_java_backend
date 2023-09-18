package com.User.Application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datafie_tbl")
public class DataFile {

	@Id   //This will create a primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pdf_id")
	private Integer pdfId;
	
	@Column(name="pdfuser_id")
	 private Integer pdfUserId;
	 
	 @Column(name="visibility")
	 private Integer visibility;
	 
	 @Column(name="url")
	 private String url;
	 
	 public DataFile() {}
	 
	public DataFile(Integer pdfId, Integer pdfUserId, Integer visibility, String url) {
		super();
		this.pdfId = pdfId;
		this.pdfUserId = pdfUserId;
		this.visibility = visibility;
		this.url = url;
	}
	public Integer getPdfId() {
		return pdfId;
	}
	public void setPdfId(Integer pdfId) {
		this.pdfId = pdfId;
	}
	public Integer getPdfUserId() {
		return pdfUserId;
	}
	public void setPdfUserId(Integer pdfUserId) {
		this.pdfUserId = pdfUserId;
	}
	public Integer getVisibility() {
		return visibility;
	}
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	} 
}
