package siva.boojparepo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import siva.boojparepo.model.Student;
import siva.boojparepo.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Student student = new Student();
		student.setStudentId(1855);
		student.setStudentName("modi");
		student.setStudentFee(90000.50);
		student.setStudentCourse("politics");
		

		Example<Student> example = Example.of(student);
		studentRepository.findAll(example).forEach(System.out::println);
		System.out.println("Runner...");

	}

}
