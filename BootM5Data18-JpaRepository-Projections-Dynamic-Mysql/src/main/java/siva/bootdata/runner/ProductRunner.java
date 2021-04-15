package siva.bootdata.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootdata.repository.ProductRepository;
import siva.bootdata.repository.ProductRepository.MyData;
import siva.bootdata.repository.ProductRepository.MyVendor;
import siva.bootdata.repository.ProductRepository.MyNames;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		List<MyData> myData = productRepository.findByProductCost(200.0, MyData.class);
		myData.stream().map(m -> m.getProductName() + "===" + m.getProductVendor()).forEach(System.out::println);

		List<MyVendor> myVendor = productRepository.findByProductCost(500.00, MyVendor.class);
		myVendor.stream().map(m -> m.getProductId() + "===" + m.getProductVendor()).forEach(System.out::println);

		List<MyNames> myNames = productRepository.findByProductCost(200.0, MyNames.class);
		myNames.stream().map(m -> m.getProductName()).forEach(System.out::println);
	}

}
