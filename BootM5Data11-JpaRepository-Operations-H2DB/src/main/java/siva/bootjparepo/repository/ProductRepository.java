package siva.bootjparepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import siva.bootjparepo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
