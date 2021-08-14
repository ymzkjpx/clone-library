package com.example.demo.domain.model.book;

import com.example.demo.domain.model.reservation.LoanableItems;
import lombok.Getter;

@Getter
public class Book {

    public Book(){}

    private Entry entry;
    private LoanableItems loanableItems;
}
