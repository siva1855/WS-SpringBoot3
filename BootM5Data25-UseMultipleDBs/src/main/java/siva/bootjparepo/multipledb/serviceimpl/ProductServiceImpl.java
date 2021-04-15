package siva.bootjparepo.multipledb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.bootjparepo.multipledb.bean.Product;
import siva.bootjparepo.multipledb.repository.ProductRepository;
import siva.bootjparepo.multipledb.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;

	@Override
	public Integer saveProduct(Product product) {

		return productRepository.save(product).getProdcutId();
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

}
