package siva.boojparepo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer employeeId;
	@NonNull
	private String employeeName;
	@NonNull
	private Double employeeSalary;
	@NonNull
	private String employeeDepartment;
}
