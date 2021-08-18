package com.example.demo.domain.model.reservation.reservation;

import com.example.demo.domain.model.material.Entry;
import com.example.demo.domain.model.member.Member;

/**
 * 予約履歴
 */
public class Reservation {
    ReservationNumber reservationNumber;
    Member member;
    Entry entry;

    public Reservation() {}

    private Reservation(ReservationNumber reservationNumber, Member member, Entry entry) {
        this.reservationNumber = reservationNumber;
        this.member = member;
        this.entry = entry;
    }

    public ReservationNumber reservationNumber() {return reservationNumber;}

    public Member member() {return member;}

    public Entry entry() {return entry;}

    public static Reservation of(Member member, Entry entry) {
        return new Reservation(ReservationNumber.generate(), member, entry);
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservationNumber=" + reservationNumber + ", member=" + member + ", entry=" + entry + '}';
    }
}
