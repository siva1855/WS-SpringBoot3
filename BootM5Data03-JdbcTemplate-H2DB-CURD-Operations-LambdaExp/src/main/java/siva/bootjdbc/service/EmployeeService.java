package siva.bootjdbc.service;

import java.util.List;

import siva.bootjdbc.model.Employee;

public interface EmployeeService {

	public int saveEmployee(Employee employee);

	public int deleteEmployee(Integer id);

	public int updateEmployee(Employee employee);

	public Employee getOneEmployee(Integer id);

	public List<Employee> getAllEmployees();
}
