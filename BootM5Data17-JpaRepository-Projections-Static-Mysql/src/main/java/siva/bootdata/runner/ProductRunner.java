package siva.bootdata.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootdata.repository.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		productRepository.findByProductVendor("mi")
		          .stream()
		          .map(m -> m.getProductName() + "=" + m.getProductCost())
				  .forEach(System.out::println);
	}

}
