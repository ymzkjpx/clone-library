package com.example.demo.domain.model.material.entry;

import lombok.AllArgsConstructor;

import java.util.Objects;

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
        return "Title: " + title().value() + " / Author: " + author().value();
    }

    public boolean isPresent() {
        return !Objects.isNull(entryNumber);
    }
}
