package com.example.demo.domain.model.book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Keyword {
    String value;

    public Keyword(String value) {
        this.value = value;
    }

    public boolean isNull() {
        return value == null;
    }

    public boolean isBlank() {
        return value.isBlank();
    }

    @Deprecated(since = "thymeleaf inspection")
    public void value() {
    }

    @Override
    public String toString() {
        return value;
    }
}
