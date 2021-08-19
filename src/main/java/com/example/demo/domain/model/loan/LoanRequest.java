package com.example.demo.domain.model.loan;

import com.example.demo.domain.model.member.MemberNumber;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class LoanRequest {
    MemberNumber memberNumber;
    ItemNumber itemNumber;
    LoanDate loanDate;

    private LoanRequest() {}

    public static LoanRequest empty() {
        return new LoanRequest();
    }

    public MemberNumber memberNumber() {
        return memberNumber;
    }

    public ItemNumber itemNumber() {
        return itemNumber;
    }

    public LoanDate loanDate() {
        return loanDate;
    }
}
