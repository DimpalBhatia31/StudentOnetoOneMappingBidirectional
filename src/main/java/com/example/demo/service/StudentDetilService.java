package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentForm;
import com.example.demo.model.StudentDetailModel;
import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentDetailRepository;

@Service
public class StudentDetilService {

	@Autowired
	StudentDetailRepository stuDeRepo;
	public void create(StudentForm stu)
	{
		StudentDetailModel s=new StudentDetailModel();
		s.setAddress(stu.getAddress());
		StudentModel sm=new StudentModel();
		sm.setName(stu.getName());
		sm.setStudentDetail(s);
		s.setStudent(sm);
		stuDeRepo.save(s);
	}
	public List<StudentDetailModel> getAll()
	{
		return stuDeRepo.findAll();
	}
	public void delete(Long id)
	{
		stuDeRepo.deleteById(id);
	}
}
