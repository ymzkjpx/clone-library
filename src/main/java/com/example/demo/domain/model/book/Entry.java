package com.example.demo.domain.model.book;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Entry {
    EntryNumber entryNumber;
    Title title;
    Author author;

    @Deprecated
    public Entry() {}

    public EntryNumber entryNumber() {return entryNumber;}

    public Title title() {return title;}

    public Author author() {return author;}

    public String showDescribe() {
        return "Title: " + title() + " / Author: " + author();
    }
}
