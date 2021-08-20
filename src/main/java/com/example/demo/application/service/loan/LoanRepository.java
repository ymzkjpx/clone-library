package com.example.demo.application.service.loan;

import com.example.demo.domain.model.loan.LoanRequest;
import com.example.demo.domain.model.reservation.loan.Loanability;

public interface LoanRepository {
    Loanability loanability(LoanRequest loanRequest);

    //   void loan(LoanRequest loanRequest);
    //
    //   LoanStatus loanStatus(LoanRequest loanRequest);
}
