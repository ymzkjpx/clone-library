package com.example.demo.application.service.reservation;

import com.example.demo.domain.model.material.entry.Entry;
import com.example.demo.domain.model.material.entry.EntryNumber;
import com.example.demo.domain.model.material.entry.Keyword;
import com.example.demo.domain.model.reservation.loan.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationQueryService {

    @Autowired
    BookRepository bookRepository;

    /**
     * 資料番号で本を見つける.
     */
    public Books search(Keyword keyword) {
        return bookRepository.search(keyword);
    }

    /**
     * 資料番号で本を見つける.
     */
    public Entry findByMaterial(EntryNumber entryNumber) {
        return bookRepository.findByMaterial(entryNumber);
    }

}
