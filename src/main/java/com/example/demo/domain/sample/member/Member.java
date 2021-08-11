package com.example.demo.domain.sample.member;

import java.util.Random;

public class Member {
    Name name;
    int age;

    public Member(Name name, int age){
        if(age == 0){
            age = new Random().nextInt(100);
        }
        this.name = name;
        this.age = age;
    }

    public Name name(){
        return name;
    }

    public int age(){
        return age;
    }

    @Override
    public String toString() {
        return "RegisterUser{" +
                "name='" + name + '\'' +
                "age='" + age + '\'' +
                '}';
    }
}
