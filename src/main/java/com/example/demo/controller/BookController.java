package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RequiredArgsConstructor
@RestController
public class BookController {

    private final BookService bookService;
    @GetMapping("/hello")

    public String HelloWorld(){
        return "Hello World";
    }
    public String HelloName(){
        return "Hello Elaina";
    }

//    @GetMapping("/clock");
//    public Date clock(){
//        Date date = new Date();
//
//        return Date;
//    }
    //restfull api: returns the status code eg. 200 means ok 404 500 etc
    //HTTP methodsL Get, post, put and delete

    @PostMapping("/book")
    public ResponseEntity<?> save(@RequestBody Book book){
        return new ResponseEntity<>(bookService.create(book), HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }
}
