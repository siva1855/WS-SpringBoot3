package siva.bootjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import siva.bootjdbc.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int count) throws SQLException {
		Employee employeeMapRow = new Employee();
		employeeMapRow.setEmpId(rs.getInt("eid"));
		employeeMapRow.setEmpName(rs.getString("ename"));
		employeeMapRow.setEmpSal(rs.getDouble("esal"));
		return employeeMapRow;
	}

}
