package siva.bootjparepo.multipledb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import siva.bootjparepo.multipledb.bean.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
