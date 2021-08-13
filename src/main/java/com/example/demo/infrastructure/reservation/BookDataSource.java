package com.example.demo.infrastructure.reservation;

import com.example.demo.application.service.BookRepository;
import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.reservation.reservation.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDataSource implements BookRepository {

    @Autowired
    BookMapper bookMapper;

    @Override
    public Books search(Keyword keyword) {
        List<Book> books = bookMapper.search(keyword);
        return new Books(books);
    }
}
