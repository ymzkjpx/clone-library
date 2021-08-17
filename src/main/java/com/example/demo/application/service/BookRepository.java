package com.example.demo.application.service;

import com.example.demo.domain.model.book.Entry;
import com.example.demo.domain.model.book.EntryNumber;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.Books;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    Books search(Keyword keyword);
    Entry findByMaterial(EntryNumber entryNumber);
}
