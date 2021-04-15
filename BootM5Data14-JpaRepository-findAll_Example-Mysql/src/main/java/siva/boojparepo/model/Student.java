package siva.boojparepo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="student1")
public class Student {
	@Id
	@GeneratedValue
	private Integer studentId;
	@NonNull
	private String studentName;
	@NonNull
	private Double studentFee;
	@NonNull
	private String studentCourse;
}
