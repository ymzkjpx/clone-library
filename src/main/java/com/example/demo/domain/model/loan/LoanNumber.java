package com.example.demo.domain.model.loan;

public class LoanNumber {
    Integer value;

    @Deprecated
    LoanNumber() {}

    public LoanNumber(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return "LoanNumber{" + "loanNumber=" + value + '}';
    }
}
