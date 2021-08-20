package com.example.demo.domain.model.loan;

public enum Loanability {
    貸出可能("◯"), 貸出不可("✕");

    String message;

    Loanability(String message) {
        this.message = message;
    }
}
