package com.example.demo.application.service.loan;

import com.example.demo.domain.model.loan.LoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    /**
     * 貸出制限を判断する
     */
    //    Loanability loanability(LoanRequest loanRequest) {
    //        return loanRequest.loanability();
    //    }

    /**
     * 本を貸し出す
     */
    public void loan(LoanRequest loanRequest) {
        loanRepository.loan(loanRequest);
    }

    /**
     * 貸出状況を提示する
     */
    void LoanStatus(LoanRequest loanRequest) {
        //        return loanRepository.loanStatus();
    }

}
