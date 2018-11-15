package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentForm;
import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping("/studentModel")
	public void create(@RequestBody StudentForm s)
	{
		studentService.createStudent(s);
	}
	
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable Long id)
	{
		studentService.delete(id);
	}
	@GetMapping("/student/{id}")
	public StudentModel get(@PathVariable Long id)
	{
		return studentService.getParticular(id);
	}
}
