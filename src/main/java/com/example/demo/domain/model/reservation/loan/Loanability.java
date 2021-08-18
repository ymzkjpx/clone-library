package com.example.demo.domain.model.reservation.loan;

public enum Loanability {
    貸出可能("◯"), 貸出不可("✕");

    String label;

    Loanability(String label) {this.label = label;}

    public static Loanability loanable(int loanableItems) {
        if (loanableItems > 0) return 貸出可能;
        return 貸出不可;
    }

    public String show() {
        return label;
    }

    @Override
    public String toString() {
        return "Loanablebility{" + "label='" + label + '\'' + '}';
    }
}
