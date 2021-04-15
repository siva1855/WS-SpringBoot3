package siva.bootjdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import siva.bootjdbc.service.StudentService;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {

		// get one student data
		int count = studentService.getAllStudentsSum();
		System.out.println(count);

	}

}
