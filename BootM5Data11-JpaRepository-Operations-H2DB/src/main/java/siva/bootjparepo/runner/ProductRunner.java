package siva.bootjparepo.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootjparepo.model.Product;
import siva.bootjparepo.repository.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------SAVE--------------");
		System.out.println(productRepository.getClass().getName());
		Product product1 = new Product("PEN", 10.5);
		productRepository.save(product1);// insert
		System.out.println(product1.getProductId());

		System.out.println("------------UPDATE-------------");
		Product product2 = new Product(product1.getProductId(), "Bottle", 30.5);
		productRepository.save(product2);// update
		System.out.println("--------Select ALL----------");
		productRepository.save(new Product("Car", 10));
		productRepository.save(new Product("Laptop", 30000));
		productRepository.save(new Product("Fan", 4000));
		productRepository.save(new Product("Cell", 10000));
		System.out.println(productRepository.count());
		// fetch all rows and print
		productRepository.findAll().forEach(System.out::println);
		System.out.println("--------------Select One------------");
		// fetch one row based on PK
		Optional<Product> product3 = productRepository.findById(1);
		if (product3.isPresent()) {
			System.out.println(product3.get());
		} else {
			System.out.println("No Data Found");
		}

		// if+isPresent
		productRepository.findById(2).ifPresent(System.out::println);
		// if+isPresent+else
		productRepository.findById(33).ifPresentOrElse(System.out::println, () -> System.out.println("No Data Found"));

		System.out.println("--------DELETE ONE--------");
		productRepository.deleteById(1);
		System.out.println("--------DELETE ALL--------");
		// productRepository.deleteAll();

		productRepository.deleteAllInBatch();

		System.exit(0);
	}

}
