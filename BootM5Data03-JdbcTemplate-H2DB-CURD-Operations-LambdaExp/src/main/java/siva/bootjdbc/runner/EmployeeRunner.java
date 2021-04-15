package siva.bootjdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import siva.bootjdbc.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		// save employee -->insert operation

		/*
		 * Employee employeeSave = new Employee(); employeeSave.setEmpId(106);
		 * employeeSave.setEmpName("ABC"); employeeSave.setEmpSal(100.00);
		 * employeeService.saveEmployee(employeeSave);
		 * System.out.println("data inserted successfully...");
		 */

		// Delete Employee -->delete operation

		/*
		 * employeeService.deleteEmployee(105);
		 * System.out.println("Employee row Deleted Successfully....");
		 */

		// updated Employee -->update operation

		/*
		 * Employee employeeUpdate = new Employee(); employeeUpdate.setEmpId(101);
		 * employeeUpdate.setEmpName("AAAA"); employeeUpdate.setEmpSal(1000.00);
		 * employeeService.updateEmployee(employeeUpdate);
		 * System.out.println("data updated successfully...");
		 */

		// fetch one employee date 
		
		
		/*
		 * Employee oneEmployeedata = employeeService.getOneEmployee(101);
		 * System.out.println(oneEmployeedata);
		 */
		
		// fetch all Employees data
		
		employeeService.getAllEmployees().forEach(System.out::println);

	}

}
