package com.example.demo.domain.model.loan;

import com.example.demo.domain.model.material.item.ItemNumber;
import com.example.demo.domain.model.member.MemberNumber;

import javax.validation.Valid;


/**
 * 貸出依頼
 */
public class LoanRequest {

    @Valid MemberNumber memberNumber;
    @Valid ItemNumber itemNumber;
    @Valid LoanDate loanDate = LoanDate.now();

    public LoanRequest(MemberNumber memberNumber, ItemNumber itemNumber, LoanDate loanDate) {
        this.memberNumber = memberNumber;
        this.itemNumber = itemNumber;
        this.loanDate = loanDate;
    }

    @Deprecated
    LoanRequest() {
    }

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

    @Override
    public String toString() {
        return "LoanRequest{" + "memberNumber=" + memberNumber + '}';
    }
}
