package com.example.demo.domain.model.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String id;
    private String title;
    private String author;
}
