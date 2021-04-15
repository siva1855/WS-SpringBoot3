package siva.bootmongodb.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import siva.bootmongodb.model.Book;
import siva.bootmongodb.repository.BookRepository;

@Component
public class BookRunner implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public void run(String... args) throws Exception {

		bookRepository.deleteAll();

		bookRepository.save(new Book(101, "CoreJava", 500.0,
				new String[] { "Raghu", "Shaker", "Sharma" },
				List.of(1.1, 3.2, 1.1), 
				Set.of("ISB-1", "ISB-2", "ISB-3")));

		System.out.println("............Done...............");

	}

}
