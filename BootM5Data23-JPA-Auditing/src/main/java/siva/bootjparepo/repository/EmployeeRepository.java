package siva.bootjparepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.bootjparepo.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
