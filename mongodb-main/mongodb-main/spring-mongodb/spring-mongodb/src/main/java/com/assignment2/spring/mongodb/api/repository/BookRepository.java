package com.assignment2.spring.mongodb.api.repository;

import com.assignment2.spring.mongodb.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
