package siva.boojparepo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.boojparepo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	List<Student> findByStudentNameLike(String studentName);
	
	List<Student> findByStudentNameStartingWith(String studentName);
   
	List<Student> findByStudentFeeBetween(Double studentFee1,Double studentFee2);
}
