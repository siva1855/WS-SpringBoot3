package siva.boojparepo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import siva.boojparepo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	 @Query("select e from siva.boojparepo.model.Employee e where employeeSalary>?1")
	//@Query("select e from siva.boojparepo.model.Employee e where employeeSalary >:val")
	List<Employee> getAllEmployees(Double val);

	@Query("select e from siva.boojparepo.model.Employee e where employeeName=:val")
	List<Employee> getAllEmployeeNames(String val);

}
