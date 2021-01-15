package com.daviquirino.bookstoremanagement.service;

import com.daviquirino.bookstoremanagement.dto.MessageResponseDto;
import com.daviquirino.bookstoremanagement.entity.Book;
import com.daviquirino.bookstoremanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDto create( Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDto.builder()
                .message("Book created with ID" + savedBook.getId())
                .build();
    }
}
