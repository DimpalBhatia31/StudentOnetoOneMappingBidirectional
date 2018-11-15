package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentForm;
import com.example.demo.model.StudentModel;
import com.example.demo.model.StudentDetailModel;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;
	@Transactional
	public void createStudent(StudentForm student)
	{
		StudentModel s=new StudentModel();
		s.setName(student.getName());
		StudentDetailModel stu=new StudentDetailModel();
		stu.setAddress(student.getAddress());
		stu.setStudent(s);
		s.setStudentDetail(stu);
		studentRepo.save(s);
	}
	
	public void delete(Long id)
	{
		studentRepo.deleteById(id);
	}
	
	public StudentModel getParticular(Long id)
	{
		return studentRepo.getParticular(id);
	}
}
