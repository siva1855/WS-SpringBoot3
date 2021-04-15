package siva.bootjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {

	private Integer studentId;
	private String studentName;
	private Double studentFee;
	private String studentCourse;
	private Double studentFeeDiscount;

}
