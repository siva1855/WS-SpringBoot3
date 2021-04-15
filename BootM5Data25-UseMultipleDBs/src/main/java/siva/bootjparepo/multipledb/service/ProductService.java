package siva.bootjparepo.multipledb.service;

import java.util.List;

import siva.bootjparepo.multipledb.bean.Product;

public interface ProductService {
	
	public Integer saveProduct(Product product); 
	
	public List<Product> getAllProducts();

}
