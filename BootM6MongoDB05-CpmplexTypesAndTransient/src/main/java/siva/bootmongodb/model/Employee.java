package siva.bootmongodb.model;

import java.util.Map;
import java.util.Properties;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	@Transient
	private String classType;
	private Map<Integer, String> projects;
	private Properties clients;
	private Address address;

}
