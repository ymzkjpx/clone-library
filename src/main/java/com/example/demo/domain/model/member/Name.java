package com.example.demo.domain.model.member;

public class Name {
    String value;

    @Deprecated
    public Name() {}

    public Name(String name) {
        this.value = name;
    }
}
