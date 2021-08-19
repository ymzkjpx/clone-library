package com.example.demo.application.service.reservation;

import com.example.demo.domain.model.material.entry.Entry;
import com.example.demo.domain.model.material.entry.EntryNumber;
import com.example.demo.domain.model.material.entry.Keyword;
import com.example.demo.domain.model.reservation.loan.Books;
import com.example.demo.domain.model.reservation.reservation.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    Books search(Keyword keyword);

    Entry findByMaterial(EntryNumber entryNumber);

    void register(Reservation entry);
}
