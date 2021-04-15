package siva.bootmongodb.runner;

import java.util.Properties;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootmongodb.model.Address;
import siva.bootmongodb.model.Employee;
import siva.bootmongodb.repository.EmployeeRepository;
@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.deleteAll();

		Properties properties=new Properties();
		properties.put("Pune","Benz Project");
		properties.put("Kolkatha","Dalmia Project");
		properties.put("Coramondal","UP");
		properties.put("SMS","GOA");


		employeeRepository.save(new Employee(101,"sivakumar",35000.50,
				"Only UI",
				Map.of(121,"Dalmia",122,"Benz",123,"SMS",124,"Jwelary"),
				properties,
				new Address("2-100","DriversColony",522413,"Piduguralla","Guntur","AP")));
		
		System.out.println("..........Documents are Inserted...............");
	}

}
