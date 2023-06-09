package com.assignment2.spring.mongodb.api.resource;

import com.assignment2.spring.mongodb.api.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.assignment2.spring.mongodb.api.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;
    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book)
    {
        repository.save(book);
        return "Added book with id : "+book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks(){
        return  repository.findAll();
    }
    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBook(@PathVariable int id)
    {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id)
    {
        repository.deleteById(id);
        return "book deleted with id : "+id;
    }

}
