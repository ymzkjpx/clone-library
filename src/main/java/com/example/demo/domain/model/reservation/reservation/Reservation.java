package com.example.demo.domain.model.reservation.reservation;

import com.example.demo.domain.model.book.Entry;
import lombok.AllArgsConstructor;

/**
 * 予約履歴
 */
@AllArgsConstructor
public class Reservation {
    Integer reservationNumber;
    Integer member;
    Entry entry;

    public Reservation(){}

    public Integer reservationNumber() {return reservationNumber;}

    public Integer member() {return member;}

    public Entry entry() {return entry;}

    @Override
    public String toString() {
        return "Reservation{" + "reservationNumber=" + reservationNumber + ", member=" + member + ", entry=" + entry + '}';
    }
}
