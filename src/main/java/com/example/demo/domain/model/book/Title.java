package com.example.demo.domain.model.book;

public class Title {
    private String value;

    public Title() {}

    public Title(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Title{" + "value='" + value + '\'' + '}';
    }
}
