package siva.boothibernate.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.boothibernate.entities.Employee;
import siva.boothibernate.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setName("sivakumar");
		employee.setSalary(45000.00);
		employee.setDoj(new Date());
		// Employee employee = getEmployee();
		employeeService.insertEmployee(employee);
	}

}
