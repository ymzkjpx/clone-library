package com.example.demo.application.service;

import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.Books;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    public Books search(Keyword keyword);
    public Book findByMaterial(Book entry);
}
