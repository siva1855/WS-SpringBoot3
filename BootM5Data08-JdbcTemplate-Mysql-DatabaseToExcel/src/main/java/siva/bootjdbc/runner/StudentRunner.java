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
		try {
			List<Student> list = studentService.getAllStudents();
			studentExcelUtil.writeDataToExcel(list);
			System.out.println("Printed Data To Excel Sheet");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
