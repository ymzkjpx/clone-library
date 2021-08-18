package com.example.demo.domain.model.member;

public class Member {
    MemberNumber memberNumber;
    Name name;
    MemberType memberType;

    @Deprecated
    public Member() {}

    public Member(MemberNumber memberNumber, Name name, MemberType memberType) {
        this.memberNumber = memberNumber;
        this.name = name;
        this.memberType = memberType;
    }

    public MemberNumber memberNumber() {
        return memberNumber;
    }

    public Name name() {
        return name;
    }

    public MemberType memberType() {
        return memberType;
    }
}
