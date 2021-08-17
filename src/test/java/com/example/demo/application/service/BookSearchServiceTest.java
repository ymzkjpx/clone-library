package com.example.demo.application.service;

import com.example.demo.LibraryDBTest;
import com.example.demo.domain.model.book.Entry;
import com.example.demo.domain.model.book.EntryNumber;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.loan.MaterialLoanability;
import com.example.demo.infrastructure.reservation.BookMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@LibraryDBTest
class BookSearchServiceTest {

    @Autowired
    BookSearchService bookSearchService;

    @Autowired
    BookMapper bookMapper;

    @Test
    @DisplayName("キーワードで本を検索できる")
    void search() {
        MaterialLoanability entry = bookSearchService.search(new Keyword("ハンドブック")).asList().get(0);
        assertAll(
                ()->assertEquals(entry.entryNumber().value(), 6),
                ()->assertEquals(entry.showLoanability().show(), "◯")
        );
    }

    @Test
    @DisplayName("資料番号で本を検索できる")
    void findByMaterial(){
        Entry entry = bookSearchService.findByMaterial(new EntryNumber(2));
        assertAll(
                ()->assertEquals(entry.entryNumber().value(), 2)
        );
    }

    @Test
    @DisplayName("資料の予約を申し込む")
    void register(){
        Entry entry = bookSearchService.findByMaterial(new EntryNumber(2));
        bookSearchService.register(entry);
    }
}