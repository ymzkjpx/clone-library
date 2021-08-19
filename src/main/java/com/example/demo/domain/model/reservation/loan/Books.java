package com.example.demo.domain.model.reservation.loan;

import com.example.demo.domain.model.material.entry.NumberOfBook;

import java.util.List;

public class Books {
    List<MaterialLoanability> list;

    public Books(List<MaterialLoanability> list) {
        this.list = list;
    }

    public NumberOfBook numberOfMaterial() {
        return new NumberOfBook(list.size());
    }

    public int size() {
        return list.size();
    }

    public boolean isPresent() {
        return size() > 0;
    }

    public List<MaterialLoanability> asList() {
        return list;
    }
}
