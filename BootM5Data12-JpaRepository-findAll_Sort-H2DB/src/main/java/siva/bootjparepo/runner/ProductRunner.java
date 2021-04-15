package siva.bootjparepo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import siva.bootjparepo.model.Product;
import siva.bootjparepo.repository.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product("Car", 10));
		productRepository.save(new Product("Laptop", 30000));
		productRepository.save(new Product("Fan", 4000));
		productRepository.save(new Product("Cell", 10000));
		System.out.println("Normal.......");
		productRepository.findAll().forEach(System.out::println);
		System.out.println("Sort by Product Cost..........");
		productRepository.findAll(Sort.by("productCost")).forEach(System.out::println);
		System.out.println("Product Name...........");
		productRepository.findAll(Sort.by(Direction.DESC, "productName")).forEach(System.out::println);
		System.exit(0);
	}

}
