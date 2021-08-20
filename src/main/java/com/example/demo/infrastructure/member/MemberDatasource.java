package com.example.demo.infrastructure.member;

import com.example.demo.application.service.member.MemberRepository;
import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
import com.example.demo.domain.model.member.loan.MemberStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.example.demo.domain.model.member.loan.MemberStatus.会員;
import static com.example.demo.domain.model.member.loan.MemberStatus.未会員;

@Repository
public class MemberDatasource implements MemberRepository {
    @Autowired
    MemberMapper memberMapper;

    public Member search(MemberNumber memberNumber) {
        return memberMapper.search(memberNumber);
    }

    @Override
    public MemberStatus status(MemberNumber memberNumber) {
        Boolean exists = memberMapper.exists(memberNumber);
        if (exists) return 会員;
        return 未会員;
    }


}
