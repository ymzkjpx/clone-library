package com.example.demo.domain.model.reservation.reservation;

import com.example.demo.domain.model.material.Entry;
import lombok.AllArgsConstructor;

/**
 * 予約履歴
 */
public class Reservation {
    ReservationNumber reservationNumber;
    Integer member;
    Entry entry;

    public Reservation(){}

    private Reservation(ReservationNumber reservationNumber, Integer member, Entry entry){
        this.reservationNumber = reservationNumber;
        this.member = member;
        this.entry = entry;
    }

    public ReservationNumber reservationNumber() {return reservationNumber;}

    public Integer member() {return member;}

    public Entry entry() {return entry;}

    public static Reservation of(int member, Entry entry){
        return new Reservation(ReservationNumber.generate(), 1, entry);
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservationNumber=" + reservationNumber + ", member=" + member + ", entry=" + entry + '}';
    }
}
