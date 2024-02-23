package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    //make creation function for Book
    private final BookRepository bookRepository;

    //dependency injection DI is a design pattern used in software engineering
    //to achieve inversion of Control
    //between classes and their dependancies/connections
    //goal: it allows for decoupling components by making them independent of the
    //concrete implementations of classes that they rely on.

//    @Autowired //this helps spring to inject an instance of BookRepository into BookService
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//        //in this example, bookservice depends on bookrepository to access and
//        //manipulate the book object data
//    }
    // insert book into our h2 database
    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);

    }
    @Transactional
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
