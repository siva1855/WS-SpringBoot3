package siva.boojparepo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import siva.boojparepo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e where e.employeeName=?1 and e.employeeSalary=?2")
	Employee fetchDataByInput(String s, Double d);

	@Query("select e.employeeName from Employee e where e.employeeName=?1 and e.employeeSalary=?2")
	String fetchNameByInput(String s, Double d);

	@Query("select e.employeeId,e.employeeName from Employee e where e.employeeName=?1 and e.employeeSalary=?2")
	Object fetchIdNameByInput(String s, Double d);

	@Query("select e from Employee e where e.employeeSalary>?1")
	List<Employee> fetchByInput(Double d);
}
