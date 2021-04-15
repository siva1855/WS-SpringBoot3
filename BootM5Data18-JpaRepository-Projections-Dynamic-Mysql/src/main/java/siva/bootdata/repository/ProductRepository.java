package siva.bootdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.bootdata.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	interface MyData {

		String getProductName();

		String getProductVendor();
	}

	interface MyVendor {
		Integer getProductId();

		String getProductVendor();
	}

	interface MyNames {
		String getProductName();
	}

	// select productName,productVendor from product where productCost=?
	<T> List<T> findByProductCost(Double productCost, Class<T> cls);
}
