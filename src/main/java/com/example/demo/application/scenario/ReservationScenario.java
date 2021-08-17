package com.example.demo.application.scenario;

import com.example.demo.application.service.BookSearchService;
import com.example.demo.domain.model.book.Entry;
import com.example.demo.domain.model.book.EntryNumber;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.loan.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationScenario {

    @Autowired
    BookSearchService bookSearchService;

    /**
     * キーワードで本を見つける.
     */
    public Books search(Keyword keyword){
        return bookSearchService.search(keyword);
    }

    /**
     * 資料番号で本を見つける
     */
    public Entry findByMaterial(EntryNumber entryNumber){
        return bookSearchService.findByMaterial(entryNumber);
    }

    /**
     * 資料の予約を申し込む
     */
    public void register(Entry entry){
        bookSearchService.register(entry);
    }
}
