package com.example.demo.infrastructure.reservation;

import com.example.demo.domain.model.material.Entry;
import com.example.demo.domain.model.material.EntryNumber;
import com.example.demo.domain.model.material.Keyword;
import com.example.demo.domain.model.reservation.loan.MaterialLoanability;
import com.example.demo.domain.model.reservation.reservation.Reservation;
import com.example.demo.domain.model.reservation.reservation.ReservationNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    List<MaterialLoanability> search(@Param("keyword") Keyword keyword, @Param("limit") int limit);

    Entry findByMaterial(@Param("entryNumber") EntryNumber entryNumber);

    int nextNumber();

    void register(@Param("reservationNumber") ReservationNumber reservationNumber, @Param("entryNumber")EntryNumber entryNumber);

    void insert未準備(@Param("reservationNumber") ReservationNumber reservationNumber);

    List<Reservation> findAll(EntryNumber entryNumber);
}
