package com.book.controller;

import com.book.domain.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/application")
    public Book getBook(){
        Book book = new Book();
        book.setTitle("Book Test");
        return book;
    }
}
