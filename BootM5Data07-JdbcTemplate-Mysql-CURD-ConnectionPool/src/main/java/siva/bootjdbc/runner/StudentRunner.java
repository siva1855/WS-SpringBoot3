package siva.bootjdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootjdbc.model.Student;
import siva.bootjdbc.service.StudentService;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		
		//insert data
		
		/*
		 * Student studentSave = new Student(); studentSave.setStudentId(101);
		 * studentSave.setStudentName("anil");
		 * studentSave.setStudentCourse("marketing");
		 * studentSave.setStudentFee(6000.00);
		 * studentSave.setStudentFeeDiscount(1000.00);
		 * studentService.saveStudent(studentSave);
		 * System.out.println("data inserted successfully...");
		 */
		 
		//update data
		/*
		 * Student studentUpdate = new Student(); 
		 * studentUpdate.setStudentId(103);
		 * studentUpdate.setStudentName("dileep");
		 * studentUpdate.setStudentCourse("tablue");
		 * studentUpdate.setStudentFee(25000.00);
		 * studentUpdate.setStudentFeeDiscount(500.00);
		 * studentService.updateStudent(studentUpdate);
		 * System.out.println("data updated successfully...");
		 */
		 //delete one data
		/*
		 * studentService.delectStudent(104);
		 * System.out.println("data deleted successfully.....");
		 */
		
		//get one student data
		/*
		 * Student student=studentService.getOneStudent(101);
		 * System.out.println(student);
		 */
		
		//get All Students Data
		studentService.getAllStudents().forEach(System.out::println);
	}

}
