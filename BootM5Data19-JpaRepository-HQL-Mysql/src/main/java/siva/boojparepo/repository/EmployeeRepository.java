package siva.boojparepo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import siva.boojparepo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("select e from siva.boojparepo.model.Employee e")
	List<Employee> getAllEmployees();
	@Query("select e.employeeName from Employee e")
	List<String> getAllEmployeeNames();
	@Query("select e.employeeName,e.employeeId from Employee e")
	List<Object[]> getAllIdsAndNames();
}
