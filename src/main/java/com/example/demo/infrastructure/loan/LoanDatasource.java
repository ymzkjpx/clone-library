package com.example.demo.infrastructure.loan;

import com.example.demo.application.service.loan.LoanRepository;
import com.example.demo.domain.model.loan.LoanNumber;
import com.example.demo.domain.model.loan.LoanRequest;
import com.example.demo.domain.model.reservation.loan.Loanability;
import com.example.demo.infrastructure.item.ItemMapper;
import com.example.demo.infrastructure.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LoanDatasource implements LoanRepository {

    @Autowired
    LoanMapper loanMapper;

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    ItemMapper itemMapper;

    @Override
    public Loanability loanability(LoanRequest loanRequest) {
        return null;
    }

    @Override
    @Transactional
    public void loan(LoanRequest loanRequest) {
        LoanNumber loanNumber = loanMapper.nextId();
        loanMapper.insert貸出履歴(loanNumber, loanRequest.itemNumber(), loanRequest.loanDate());
        itemMapper.delete貸出可能(loanRequest.itemNumber());
        itemMapper.insert貸出中(loanRequest.itemNumber());
        memberMapper.insertRelation(loanRequest.memberNumber(), loanNumber);
    }
}
