package siva.boothibernate.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.boothibernate.dao.EmployeeDao;
import siva.boothibernate.entities.Employee;
import siva.boothibernate.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.createEmployee(employee);
	}

}
