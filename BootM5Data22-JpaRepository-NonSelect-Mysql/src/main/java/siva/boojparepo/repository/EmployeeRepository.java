package siva.boojparepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import siva.boojparepo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Modifying
	@Transactional
	@Query("update Employee e set e.employeeSalary=:employeeSalary where employeeName=:employeeName")
	Integer modifySalaryByName(Double employeeSalary, String employeeName);

	@Modifying
	@Transactional
	@Query("delete from Employee e where employeeSalary=:employeeSalary")
	Integer removeEmployeeBySalary(Double employeeSalary);
}
