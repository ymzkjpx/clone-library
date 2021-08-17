package com.example.demo.infrastructure.reservation;

import com.example.demo.application.service.BookRepository;
import com.example.demo.domain.model.book.*;
import com.example.demo.domain.model.reservation.Books;
import com.example.demo.domain.model.reservation.MaterialLoanability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    public void register(EntryNumber entryNumber){
        bookMapper.register(entryNumber);
    }


}
