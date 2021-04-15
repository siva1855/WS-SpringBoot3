package siva.boojparepo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.boojparepo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
    //select * from student2 where studentFee=?
	List<Student> findByStudentFeeLessThan(Double studentFee);

	// select * from student2 where studentCourse=?
	List<Student> findByStudentCourse(String studentCourse);

	// select * from student2 where studentName is not null
	List<Student> findByStudentNameIsNotNull();

	// select * from student2 where studentId in(?,?,?,?,?...)
	List<Student> findByStudentIdIn(Collection<Integer> studentId);
}
