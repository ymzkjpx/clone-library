package com.example.demo.application.service;

import com.example.demo.LibraryDBTest;
import com.example.demo.domain.model.material.Entry;
import com.example.demo.domain.model.material.EntryNumber;
import com.example.demo.domain.model.material.Keyword;
import com.example.demo.domain.model.reservation.loan.MaterialLoanability;
import com.example.demo.infrastructure.reservation.BookMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@LibraryDBTest
class ReservationQueryServiceTest {

    @Autowired
    ReservationQueryService reservationQueryService;

    @Autowired
    BookMapper bookMapper;

    @Test
    @DisplayName("キーワードで本を検索できる")
    void search() {
        MaterialLoanability entry = reservationQueryService.search(new Keyword("ハンドブック")).asList().get(0);
        assertAll(
                ()->assertEquals(entry.entryNumber().value(), 6),
                ()->assertEquals(entry.showLoanability().show(), "◯")
        );
    }

    @Test
    @DisplayName("資料番号で本を検索できる")
    void findByMaterial(){
        Entry entry = reservationQueryService.findByMaterial(new EntryNumber(2));
        assertAll(
                ()->assertEquals(entry.entryNumber().value(), 2)
        );
    }
}