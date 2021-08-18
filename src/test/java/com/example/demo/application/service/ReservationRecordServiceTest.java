package com.example.demo.application.service;

import com.example.demo.LibraryDBTest;
import com.example.demo.domain.model.book.Entry;
import com.example.demo.domain.model.book.EntryNumber;
import com.example.demo.domain.model.reservation.reservation.Reservation;
import com.example.demo.infrastructure.reservation.BookMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@LibraryDBTest
class ReservationRecordServiceTest {

    @Autowired
    ReservationQueryService reservationQueryService;

    @Autowired
    ReservationRecordService reservationRecordService;

    @Autowired
    BookMapper bookMapper;


    @Test
    @DisplayName("資料の予約を申し込む")
    void register(){
        Entry entry1 = reservationQueryService.findByMaterial(new EntryNumber(2));
        reservationRecordService.register(entry1);
        List<Reservation> reservations = bookMapper.findAll(entry1.entryNumber());
        Reservation reservation = reservations.get(1);
        assertAll(
                ()->assertEquals(reservation.reservationNumber(), 2),
                ()->assertEquals(reservation.member(), 1),
                ()->assertEquals(reservation.entry().entryNumber().value(), 2)
        );
    }

}