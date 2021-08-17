package com.example.demo.domain.model.book;

import com.example.demo.domain.model.reservation.loan.LoanableItems;
import com.example.demo.domain.model.reservation.loan.Loanability;

public class Book {
    Entry entry;
    LoanableItems loanableItems;

    public String describeBook() {
        return entry.showDescribe();
    }

    public String showLoanability() {
        return loanability(loanableItems).show();
    }

    private Loanability loanability(LoanableItems loanableItems) {
        return Loanability.loanable(loanableItems.value());
    }

    public Entry entry(){
        return entry;
    }

    public EntryNumber entryNumber(){
        return entry.entryNumber();
    }

    public LoanableItems loanableItems(){
        return loanableItems;
    }

    @Override
    public String toString() {
        return "Book{" + "entry=" + entry + ", loanableItems=" + loanableItems + '}';
    }
}
