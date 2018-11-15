package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentForm;
import com.example.demo.model.StudentDetailModel;
import com.example.demo.service.StudentDetilService;

@RestController
public class StudentDetailController {

	@Autowired
	StudentDetilService s;
	@PostMapping("/studentDetail")
	public void create(@RequestBody StudentForm st)
	{
		s.create(st);
	}
	@GetMapping("/studentD")
	public List<StudentDetailModel> get()
	{
		return s.getAll();
	}
	@DeleteMapping("/studentD/{id}")
	public void delete(@PathVariable Long id)
	{
		s.delete(id);
	}
}
