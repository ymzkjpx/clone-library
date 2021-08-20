package com.example.demo.infrastructure.member;

import com.example.demo.domain.model.loan.LoanNumber;
import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    Member search(MemberNumber memberNumber);

    Boolean exists(@Param("memberNumber") MemberNumber memberNumber);

    void insertRelation(@Param("memberNumber") MemberNumber memberNumber, @Param("loanNumber") LoanNumber loanNumber);
}
