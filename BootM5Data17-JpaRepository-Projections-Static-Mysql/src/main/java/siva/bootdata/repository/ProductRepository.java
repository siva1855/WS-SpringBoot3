package siva.bootdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.bootdata.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	interface ProductData {
		String getProductName();

		Double getProductCost();
	}

	List<ProductData> findByProductVendor(String productVendor);
}
