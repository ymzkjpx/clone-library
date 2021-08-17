package com.example.demo.domain.model.reservation;

import com.example.demo.domain.model.book.Entry;
import com.example.demo.domain.model.book.EntryNumber;
import com.example.demo.domain.model.book.Title;

public class MaterialLoanability {
    Entry entry;
    LoanableItems loanableItems;

    public String showTitle(){
        return entry.title().value();
    }

    public String showAuthor(){
        return entry.author().value();
    }

    public Loanability showLoanability(){
        return loanability(loanableItems);
    }

    private Loanability loanability(LoanableItems loanableItems){
        return Loanability.loanable(loanableItems.value());
    }

    public EntryNumber entryNumber(){
        return entry.entryNumber();
    }
}
