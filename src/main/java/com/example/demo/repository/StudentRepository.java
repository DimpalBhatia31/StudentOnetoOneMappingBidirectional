package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentModel;
@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
	
	@Query(value="select * from student_model where student_detail_id=22")
	StudentModel getParticular(Long id);

}
