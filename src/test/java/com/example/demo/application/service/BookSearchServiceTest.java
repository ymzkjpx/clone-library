package com.example.demo.application.service;

import com.example.demo.LibraryDBTest;
import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.Books;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@LibraryDBTest
class BookSearchServiceTest {

    @Autowired
    BookSearchService bookSearchService;

    @Test
    void search() {
        Book book = bookSearchService.search(new Keyword("ハンドブック")).asList().get(0);
        assertAll(
                ()->assertEquals(book.entry().id().value(), 6),
                ()->assertEquals(book.loanableItems().value(), 1)
        );
    }
}