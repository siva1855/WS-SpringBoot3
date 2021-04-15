package siva.bootmongodb.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootmongodb.model.Product;
import siva.bootmongodb.repository.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("............Delete All Records..........");
		productRepository.deleteAll();

		System.out.println(".............Inserted Data..............");
		productRepository.save(new Product("laptop", "v110", 30500.20, "Lenovo"));
		productRepository.save(new Product("Mobile", "MI6", 7200.20, "Redmi"));
		productRepository.save(new Product("Mouse", "HP12", 300.20, "HP"));
		productRepository.save(new Product("Keyboard", "LOG12", 500.20, "Logistics"));
		

		String id1 = productRepository.save(new Product("Car", "Benz123", 5000000.50, "Benz")).getProductId();
		String id2 = productRepository.save(new Product("TV", "Samsung123", 50000.50, "Samsung")).getProductId();

		System.out.println("............fetech all Records.........");
		productRepository.findAll().forEach(System.out::println);

		System.out.println("..........findByProductCode............");
		productRepository.findByProductCode("v110").forEach(System.out::println);

		System.out.println(".......(Delete byUsing------- Id1).............");
		productRepository.deleteById(id1);
		productRepository.findAll().forEach(System.out::println);

		System.out.println("......update(if id is exit----id2)......");
		productRepository.save(new Product(id2, "AC", "AC110", 52500.20, "Hitachi"));
		productRepository.findAll().forEach(System.out::println);

	}

}
