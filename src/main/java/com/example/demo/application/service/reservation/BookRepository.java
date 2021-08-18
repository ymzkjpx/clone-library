package com.example.demo.application.service.reservation;

import com.example.demo.domain.model.material.Entry;
import com.example.demo.domain.model.material.EntryNumber;
import com.example.demo.domain.model.material.Keyword;
import com.example.demo.domain.model.reservation.loan.Books;
import com.example.demo.domain.model.reservation.reservation.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    Books search(Keyword keyword);
    Entry findByMaterial(EntryNumber entryNumber);
    void register(Reservation entry);
}
