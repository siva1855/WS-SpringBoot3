package siva.bootjparepo.multipledb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import siva.bootjparepo.multipledb.bean.Product;
import siva.bootjparepo.multipledb.service.ProductService;

@RestController
public class UserRestController {
	@Autowired
	public ProductService productService;

	@PostMapping("/save")
	public ResponseEntity<String> saveProductInToDB(@RequestBody Product product) {
		ResponseEntity<String> response = null;
		try {
			Integer id = productService.saveProduct(product);
			response = new ResponseEntity<String>(id + "-saved", HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<String>("Unable to Save", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return response;
	}

	@GetMapping("/all")
	public ResponseEntity<?> findAllProducts() {
		ResponseEntity<?> response = null;
		try {
			List<Product> list = productService.getAllProducts();
			if (list != null && !list.isEmpty())
				response = new ResponseEntity<List<Product>>(list, HttpStatus.OK);
			else
				response = new ResponseEntity<String>("No Data Found", HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<String>("Unable to fetch Data", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return response;
	}

}
