package siva.bootjparepo.serviceImpl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.bootjparepo.model.Employee;
import siva.bootjparepo.model.InputRequest;
import siva.bootjparepo.repository.EmployeeRepository;
import siva.bootjparepo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;

	public String saveEmployee(InputRequest<Employee> request) {
		String currentUser = request.getLoggedInUser();
		request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());
		Employee employee = request.getEmployee();
		employee.setCreatedBy(currentUser);
		repository.save(employee);
		return "Employee saved successfully...";

	}

	public String updateEmployee(int id, double salary, InputRequest<Employee> request) {
		Employee employee = repository.findById(id).get();
		if (employee != null) {
			employee.setSalary(salary);
			employee.setModifiedBy(request.getLoggedInUser());
			repository.saveAndFlush(employee);
		} else {
			throw new RuntimeException("Employee not found with id : " + id);
		}
		return "Employee Updated successfully ";
	}

}
