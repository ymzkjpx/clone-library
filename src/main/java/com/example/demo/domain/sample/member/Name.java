package com.example.demo.domain.sample.member;

public class Name {
    String value;

    public Name(String name){
        this.value = name;
    }

    public String value(){
        return value;
    }


    @Override
    public String toString() {
        return "Name{" +
                "vlaue='" + value + '\'' +
                '}';
    }
}
