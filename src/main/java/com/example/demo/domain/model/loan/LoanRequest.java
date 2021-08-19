package com.example.demo.domain.model.loan;

import com.example.demo.domain.model.member.MemberNumber;

import javax.validation.Valid;


/**
 * 貸出依頼
 */
public class LoanRequest {

    @Valid MemberNumber memberNumber;

    public LoanRequest(@Valid MemberNumber memberNumber) {
        this.memberNumber = memberNumber;
    }

    @Deprecated
    LoanRequest() {
    }

    public static LoanRequest empty() {
        return new LoanRequest();
    }

    public MemberNumber getMemberNumber() {
        return memberNumber;
    }

    @Override
    public String toString() {
        return "LoanRequest{" + "memberNumber=" + memberNumber + '}';
    }
}
