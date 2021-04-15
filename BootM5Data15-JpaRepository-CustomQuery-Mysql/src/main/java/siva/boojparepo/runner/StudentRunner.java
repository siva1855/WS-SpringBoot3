package siva.boojparepo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import siva.boojparepo.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(".......findByStudentFeeLessThan(4500.50).........");
		studentRepository.findByStudentFeeLessThan(4500.50).forEach(System.out::println);
		System.out.println(".............findByStudentCourse(java).............");
		studentRepository.findByStudentCourse("java").forEach(System.out::println);
		System.out.println("................findByStudentNameIsNotNull()..........");
		studentRepository.findByStudentNameIsNotNull().forEach(System.out::println);
		System.out.println("............findByStudentIdIn(Arrays.asList(1, 2, 5)...........");
		studentRepository.findByStudentIdIn(Arrays.asList(1, 2, 5)).forEach(System.out::println);

	}

}
