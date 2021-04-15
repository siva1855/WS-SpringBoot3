package siva.boojparepo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.boojparepo.repository.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("..........All Employees------------");
		employeeRepository.getAllEmployees(3000.00).forEach(System.out::println);
		System.out.println("--------All EmployeeName");
		employeeRepository.getAllEmployeeNames("annapurna").forEach(System.out::println);
		
	}

}
