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
		System.out.println("-------------------------");
		employeeRepository.modifySalaryByName(70000.0, "annapurna");
		employeeRepository.removeEmployeeBySalary(20000.0);
	}

}
