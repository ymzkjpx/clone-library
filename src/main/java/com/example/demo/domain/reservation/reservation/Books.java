package com.example.demo.domain.reservation.reservation;

import com.example.demo.domain.model.book.Book;

import java.util.List;

public class Books {
    List<Book> list;

    public Books(List<Book> list){
        this.list = list;
    }

    public int size(){
        return list.size();
    }

    public List<Book> asList(){
        return list;
    }
}
