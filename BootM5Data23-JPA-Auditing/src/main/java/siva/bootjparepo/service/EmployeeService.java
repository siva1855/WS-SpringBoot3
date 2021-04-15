package siva.bootjparepo.service;


import siva.bootjparepo.model.Employee;
import siva.bootjparepo.model.InputRequest;

public interface EmployeeService {

	public String saveEmployee(InputRequest<Employee> request);
	
	public String updateEmployee(int id, double salary, InputRequest<Employee> request);
}
