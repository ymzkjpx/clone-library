package com.example.demo.application.service;

import com.example.demo.LibraryDBTest;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.MaterialLoanability;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@LibraryDBTest
class BookSearchServiceTest {

    @Autowired
    BookSearchService bookSearchService;

    @Test
    void search() {
        MaterialLoanability entry = bookSearchService.search(new Keyword("ハンドブック")).asList().get(0);
        assertAll(
                ()->assertEquals(entry.entryNumber().value(), 6),
                ()->assertEquals(entry.showLoanability().show(), "◯")
        );
    }
}