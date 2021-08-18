package com.example.demo.application.service;

import com.example.demo.domain.model.material.Entry;
import com.example.demo.domain.model.reservation.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationRecordService {
    @Autowired
    BookRepository bookRepository;

    /**
     * 資料の予約を申し込む
     */
    public void register(Reservation reservation){
        bookRepository.register(reservation);
    }
}
