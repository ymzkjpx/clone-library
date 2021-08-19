package com.example.demo.application.scenario;

import com.example.demo.application.service.member.MemberQueryService;
import com.example.demo.application.service.reservation.ReservationQueryService;
import com.example.demo.application.service.reservation.ReservationRecordService;
import com.example.demo.domain.model.material.entry.Entry;
import com.example.demo.domain.model.material.entry.EntryNumber;
import com.example.demo.domain.model.material.entry.Keyword;
import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
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

    @Autowired
    MemberQueryService memberQueryService;

    /**
     * キーワードで本を見つける.
     */
    public Books search(Keyword keyword) {
        return reservationQueryService.search(keyword);
    }

    /**
     * 資料番号で本を見つける
     */
    public Entry findByMaterial(EntryNumber entryNumber) {
        return reservationQueryService.findByMaterial(entryNumber);
    }

    /**
     * 資料の予約を申し込む
     */
    public void register(MemberNumber memberNumber, Entry entry) {
        Member member = memberQueryService.search(memberNumber);
        Reservation reservation = Reservation.of(member, entry);
        reservationRecordService.register(reservation);
    }
}
