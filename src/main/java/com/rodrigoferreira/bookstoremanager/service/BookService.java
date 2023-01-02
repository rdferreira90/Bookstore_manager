package com.rodrigoferreira.bookstoremanager.service;

import com.rodrigoferreira.bookstoremanager.dto.MessageResponseDTO;
import com.rodrigoferreira.bookstoremanager.entity.Book;
import com.rodrigoferreira.bookstoremanager.repository.BookRepository;
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

    public MessageResponseDTO create(@RequestBody Book book) {
        Book saveBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created whit ID " + saveBook.getId())
                .build();
    }
}
