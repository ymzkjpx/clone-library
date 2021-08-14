package com.example.demo.domain.model.book;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Entry {
    private Id id;
    private Title title;
    private Author author;

    public Entry() {}

    public Id id() {return id;}

    public Title title() {return title;}

    public Author author() {return author;}
}
