package com.example.demo.infrastructure.reservation;

import com.example.demo.application.service.reservation.BookRepository;
import com.example.demo.domain.model.material.*;
import com.example.demo.domain.model.reservation.loan.Books;
import com.example.demo.domain.model.reservation.loan.MaterialLoanability;
import com.example.demo.domain.model.reservation.reservation.Reservation;
import com.example.demo.domain.model.reservation.reservation.ReservationNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookDataSource implements BookRepository {

    @Autowired
    BookMapper bookMapper;

    @Override
    public Books search(Keyword keyword) {
        List<MaterialLoanability> books = bookMapper.search(keyword, NumberOfBook.MAX_TO_SHOW + 1);
        return new Books(books);
    }

    @Override
    public Entry findByMaterial(EntryNumber entryNumber){
        return bookMapper.findByMaterial(entryNumber);
    }

    @Override
    @Transactional
    public void register(Reservation reservation){
        ReservationNumber reservationNumber = ReservationNumber.generate();
        bookMapper.register(reservationNumber, reservation.entry().entryNumber());
        bookMapper.insert未準備(reservationNumber);
    }
}
