package siva.boojparepo.runner;

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
		System.out.println("------Like end with N-------");
		studentRepository.findByStudentNameLike("%N").forEach(System.out::println);
		System.out.println("---------start with K---------");
		studentRepository.findByStudentNameStartingWith("k").forEach(System.out::println);

		System.out.println("---------between-------------");
		studentRepository.findByStudentFeeBetween(4000.0, 7000.0).forEach(System.out::println);
	}

}
