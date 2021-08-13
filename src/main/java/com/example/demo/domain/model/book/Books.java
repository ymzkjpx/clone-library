package com.example.demo.domain.model.book;

import java.util.List;

public class Books {
    List<Book> list;

    public Books(List<Book> list){
        this.list = list;
    }

    public NumberOfBook numberOfMaterial(){
        return new NumberOfBook(list.size());
    }

    public int size(){
        return list.size();
    }

    public boolean isPresent(){
        return size() > 0;
    }

    public List<Book> asList(){
        return list;
    }
}
