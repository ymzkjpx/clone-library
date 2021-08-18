package com.example.demo.domain.model.member;

public class MemberNumber {
    Integer value;

    @Deprecated
    public MemberNumber() {}

    public MemberNumber(Integer number) {
        this.value = number;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return "MemberNumber{" + "value=" + value + '}';
    }

    public static MemberNumber empty() {
        return new MemberNumber();
    }
}
