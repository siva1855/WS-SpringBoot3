package siva.bootjdbc.model;

import java.sql.ResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;

	public static Employee of(ResultSet rs) {
		Employee employee = null;
		try {
			employee = new Employee(rs.getInt("eid"), 
					                rs.getString("ename"),
                                    rs.getDouble("esal"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
}
