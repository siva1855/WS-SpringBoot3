package siva.bootmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import siva.bootmongodb.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
	
	//sql---select * from product where productCode=?;
	List<Product> findByProductCode(String productCode);

}
