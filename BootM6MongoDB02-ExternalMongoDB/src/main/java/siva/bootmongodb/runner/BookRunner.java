package siva.bootmongodb.runner;

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
		
		bookRepository.save(new Book("CoreJava",500.0));
		bookRepository.save(new Book("Spring",250.20));
		bookRepository.save(new Book("Hibernate",155.20));
		bookRepository.save(new Book("SpringBoot",100.20));
		bookRepository.save(new Book("MocroServices",400.20));
		bookRepository.save(new Book("Angular8",700.20));
		bookRepository.save(new Book("SQL",200.20));
		bookRepository.save(new Book("Non-SQL",150.20));
		
		bookRepository.findAll().forEach(System.out::println);
	}

}
