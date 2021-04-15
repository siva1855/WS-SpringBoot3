package siva.boojparepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.boojparepo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
