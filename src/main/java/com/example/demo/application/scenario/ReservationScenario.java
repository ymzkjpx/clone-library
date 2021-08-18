package com.example.demo.application.scenario;

import com.example.demo.application.service.ReservationQueryService;
import com.example.demo.application.service.ReservationRecordService;
import com.example.demo.domain.model.material.Entry;
import com.example.demo.domain.model.material.EntryNumber;
import com.example.demo.domain.model.material.Keyword;
import com.example.demo.domain.model.reservation.loan.Books;
import com.example.demo.domain.model.reservation.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationScenario {

    @Autowired
    ReservationQueryService reservationQueryService;

    @Autowired
    ReservationRecordService reservationRecordService;

    /**
     * キーワードで本を見つける.
     */
    public Books search(Keyword keyword){
        return reservationQueryService.search(keyword);
    }

    /**
     * 資料番号で本を見つける
     */
    public Entry findByMaterial(EntryNumber entryNumber){
        return reservationQueryService.findByMaterial(entryNumber);
    }

    /**
     * 資料の予約を申し込む
     */
    public void register(Entry entry){
        Reservation reservation = Reservation.of(1, entry);
        reservationRecordService.register(reservation);
    }
}
