package com.example.demo.application.scenario;

import com.example.demo.application.service.loan.LoanService;
import com.example.demo.application.service.member.MemberQueryService;
import com.example.demo.domain.model.loan.LoanRequest;
import com.example.demo.domain.model.member.loan.MemberStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanScenario {

    @Autowired
    LoanService loanService;

    @Autowired
    MemberQueryService memberQueryService;


    /**
     * 会員の会員ステータスを確認する
     */
    public MemberStatus memberStatus(LoanRequest loanRequest) {
        return memberQueryService.status(loanRequest.memberNumber());
    }

    /**
     * 貸出制限を判断する
     */
    //    public Loanability loanability() {
    //        return loanService.loanability();
    //    }

    /**
     * 本を貸し出す
     */
    //    public void loan() {
    //        return loanService.loan();
    //    }

    /**
     * 貸出状況を提示する
     */
    //    public LoanStatus loanStatus() {
    //        return loanService.loanStatus();
    //    }

}
