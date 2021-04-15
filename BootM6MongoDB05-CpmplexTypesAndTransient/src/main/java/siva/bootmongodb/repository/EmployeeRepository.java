package siva.bootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import siva.bootmongodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
