package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class StudentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JsonBackReference
	StudentDetailModel studentDetail;
	public StudentDetailModel getStudentDetail() {
		return studentDetail;
	}
	public void setStudentDetail(StudentDetailModel studentDetail) {
		this.studentDetail = studentDetail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
