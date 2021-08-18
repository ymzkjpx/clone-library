package com.example.demo.domain.model.material;

public class Author {
    String value;

    public Author() {
    }

    public Author(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Author{" + "value='" + value + '\'' + '}';
    }
}
