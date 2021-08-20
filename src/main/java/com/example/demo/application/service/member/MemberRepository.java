package com.example.demo.application.service.member;

import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
import com.example.demo.domain.model.member.loan.MemberStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    Member search(MemberNumber memberNumber);

    MemberStatus status(MemberNumber memberNumber);
}
