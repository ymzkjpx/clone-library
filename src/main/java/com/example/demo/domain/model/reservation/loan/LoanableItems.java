package com.example.demo.domain.model.reservation.loan;

public class LoanableItems {
    private Integer stock;

    @Deprecated
    public LoanableItems() {}

    public LoanableItems(Integer stock) {
        this.stock = stock;
    }

    public Integer value() {
        return stock;
    }
}
