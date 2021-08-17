package com.example.demo.application.service;

import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookSearchService {

    @Autowired
    BookRepository bookRepository;

    /**
     * 資料番号で本を見つける.
     */
    public Books search(Keyword keyword){
        return bookRepository.search(keyword);
    }

    /**
     * 資料番号で本を見つける.
     */
    public Book findByMaterial(Book entry){
        bookRepository.findByMaterial(entry);
    }
}
