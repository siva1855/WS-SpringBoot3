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
		
		bookRepository.save(new Book("Boot",152.20));
		bookRepository.save(new Book("Spring",250.20));
		bookRepository.save(new Book("Hibernate",155.20));
		bookRepository.save(new Book("Angular",100.20));
		bookRepository.save(new Book("CSS",100.20));
		
		bookRepository.findAll().forEach(System.out::println);
	}

}
