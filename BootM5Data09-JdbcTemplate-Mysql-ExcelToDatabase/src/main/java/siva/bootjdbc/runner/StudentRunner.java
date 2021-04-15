package siva.bootjdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootjdbc.model.Student;
import siva.bootjdbc.service.StudentService;
import siva.bootjdbc.util.StudentExcelUtil;
@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentExcelUtil studentExcelUtil;
	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		List<Student> student = studentExcelUtil.readFromExcel();
		studentService.saveStudent(student);
		System.out.println("Records are inserted Successfully");
	}

}
