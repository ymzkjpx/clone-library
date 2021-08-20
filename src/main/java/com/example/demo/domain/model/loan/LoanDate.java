package com.example.demo.domain.model.loan;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoanDate {
    @NotNull(message = "貸出日を入力してください")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate value;

    @Deprecated
    LoanDate() {}

    private LoanDate(LocalDate value) {
        this.value = value;
    }

    public static LoanDate now() {
        return new LoanDate(LocalDate.now());
    }

    public static LoanDate from(LocalDate localDate) {
        return new LoanDate(localDate);
    }

    public static LoanDate parse(String dateText) {
        return new LoanDate(LocalDate.parse(dateText));
    }

    public LocalDate value() {
        return value;
    }

    public String show() {
        return value.format(DateTimeFormatter.ofPattern("M月d日(E)"));
    }
}
