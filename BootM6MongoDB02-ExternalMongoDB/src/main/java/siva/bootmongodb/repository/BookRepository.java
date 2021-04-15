package siva.bootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import siva.bootmongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
