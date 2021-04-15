package siva.bootjdbc.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.bootjdbc.dao.EmployeeDao;
import siva.bootjdbc.mapper.EmployeeRowMapper;
import siva.bootjdbc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int saveEmployee(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE_TABLE VALUES(?,?,?)";
		int count = jdbcTemplate.update(sql, employee.getEmpId(), employee.getEmpName(), employee.getEmpSal());
		return count;
	}

	@Override
	public int deleteEmployee(Integer id) {
		String sql = "DELETE FROM EMPLOYEE_TABLE WHERE EID=?";
		int count = jdbcTemplate.update(sql, id);
		return count;
	}

	@Override
	public int updateEmployee(Employee employee) {
		String sql = "UPDATE EMPLOYEE_TABLE SET ENAME=?,ESAL=? WHERE EID=?";
		int count = jdbcTemplate.update(sql, employee.getEmpName(), employee.getEmpSal(), employee.getEmpId());
		return count;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		String sql="SELECT * FROM EMPLOYEE_TABLE WHERE EID=?";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, employeeRowMapper,id);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql="SELECT * FROM EMPLOYEE_TABLE";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		List<Employee> employeeList=jdbcTemplate.query(sql, employeeRowMapper);
		return employeeList;
	}

	

}
