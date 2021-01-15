package com.daviquirino.bookstoremanagement.controller;


import com.daviquirino.bookstoremanagement.dto.MessageResponseDto;
import com.daviquirino.bookstoremanagement.entity.Book;
import com.daviquirino.bookstoremanagement.repository.BookRepository;
import com.daviquirino.bookstoremanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDto create(@RequestBody Book book) {
        return bookService.create(book);
    }
}
