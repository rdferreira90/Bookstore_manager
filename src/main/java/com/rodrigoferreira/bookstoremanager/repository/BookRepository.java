package com.rodrigoferreira.bookstoremanager.repository;

import com.rodrigoferreira.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
