package com.example.demo.application.service;

import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.reservation.reservation.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookSearchService {

    @Autowired
    BookRepository bookRepository;

    public Books search(Keyword keyword){
        return bookRepository.search(keyword);
    }
}