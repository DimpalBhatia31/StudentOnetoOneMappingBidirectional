package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentDetailModel;
@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetailModel, Long>{

}
