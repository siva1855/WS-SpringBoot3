package siva.boojparepo.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import siva.boojparepo.model.Student;
import siva.boojparepo.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(".............");
		// of(pageNumber,PageSize)
		studentRepository.findAll(PageRequest.of(0, 3)).forEach(System.out::println);

		Page<Student> page = studentRepository.findAll(PageRequest.of(1, 3));
		System.out.println("Is first page :: "+page.isFirst());
		System.out.println("Is last page :: "+page.isLast());
		System.out.println("Is Next Page :: "+page.hasNext());
		System.out.println("Is Previous Page :: "+page.hasPrevious());

		List<Student> list = page.getContent();
		list.forEach(System.out::println);
		// number of rows
		System.out.println("number of rows :: "+page.getTotalElements());
		// number of pages
		System.out.println("number of pages :: "+page.getTotalPages());
		// number of page Number
		System.out.println("number of page Number :: "+page.getNumber());
		// page Size
		System.out.println("page Size :: "+page.getSize());

	}

}
