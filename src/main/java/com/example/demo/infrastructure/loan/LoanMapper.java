package com.example.demo.infrastructure.loan;

import com.example.demo.domain.model.loan.LoanDate;
import com.example.demo.domain.model.loan.LoanNumber;
import com.example.demo.domain.model.material.item.ItemNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoanMapper {
    LoanNumber nextId();

    void insert貸出履歴(@Param("loanNumber") LoanNumber loanNumber, @Param("itemNumber") ItemNumber itemNumber, @Param("loanDate") LoanDate loanDate);
}
