package com.daviquirino.bookstoremanagement.repository;

import com.daviquirino.bookstoremanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
