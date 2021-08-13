package com.example.demo.application.scenario;

import com.example.demo.application.service.BookSearchService;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.reservation.reservation.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationScenario {

    @Autowired
    BookSearchService bookSearchService;

    public Books search(Keyword keyword){
        return bookSearchService.search(keyword);
    }
}