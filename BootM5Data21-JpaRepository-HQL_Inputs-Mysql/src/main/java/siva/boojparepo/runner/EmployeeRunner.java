package siva.boojparepo.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.boojparepo.model.Employee;
import siva.boojparepo.repository.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------------");
		Employee employee=employeeRepository.fetchDataByInput("siva", 45000.0);
		System.out.println(employee);
		
		System.out.println("---------------------");
		String s=employeeRepository.fetchNameByInput("annapurna", 50000.0);
		System.out.println(s);
		
		Object obj=employeeRepository.fetchIdNameByInput("satya", 20000.0);
		Object[] arg=(Object[])obj;
		System.out.println(arg[0]+"==="+arg[1]);
		
		
		List<Employee> employee1=employeeRepository.fetchByInput(30000.0);
		System.out.println(employee1);
	}

}
