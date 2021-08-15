package com.example.demo.domain.model.book;

import com.example.demo.domain.model.reservation.LoanableItems;
import com.example.demo.domain.model.reservation.Loanability;
import lombok.Getter;

@Getter
public class Book {

    public Book() {}

    private Entry entry;
    private LoanableItems loanableItems;

    public String describeBook() {
        return entry.showDescribe();
    }

    public String showLoanability() {
        return loanability(loanableItems).show();
    }

    private Loanability loanability(LoanableItems loanableItems) {
        return Loanability.loanable(loanableItems.value());
    }

    public Id Bookid() {
        return entry.id();
    }

    @Override
    public String toString() {
        return "Book{" + "entry=" + entry + ", loanableItems=" + loanableItems + '}';
    }
}
