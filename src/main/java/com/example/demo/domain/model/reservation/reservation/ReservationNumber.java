package com.example.demo.domain.model.reservation.reservation;

import java.util.UUID;

public class ReservationNumber {
    UUID value;

    @Deprecated
    private ReservationNumber(){}

    private ReservationNumber(UUID uuid){
        this.value = uuid;
    }

    public static ReservationNumber generate(){
        UUID uuid = UUID.randomUUID();
        return new ReservationNumber(uuid);
    }

    public UUID value(){
        return value;
    }

    public String asString(){
        return toString();
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
