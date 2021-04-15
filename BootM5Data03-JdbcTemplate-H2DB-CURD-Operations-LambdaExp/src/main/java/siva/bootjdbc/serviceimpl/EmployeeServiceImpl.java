package siva.bootjdbc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.bootjdbc.dao.EmployeeDao;
import siva.bootjdbc.model.Employee;
import siva.bootjdbc.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public int saveEmployee(Employee employee) {

		return employeeDao.saveEmployee(employee);
	}

	@Override
	public int deleteEmployee(Integer id) {

		return employeeDao.deleteEmployee(id);
	}

	@Override
	public int updateEmployee(Employee employee) {

		return employeeDao.updateEmployee(employee);
	}

	@Override
	public Employee getOneEmployee(Integer id) {

		return employeeDao.getOneEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeDao.getAllEmployees();
	}

}
