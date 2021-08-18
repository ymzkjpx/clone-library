package com.example.demo.infrastructure.member;

import com.example.demo.application.service.member.MemberRepository;
import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDatasource implements MemberRepository {
    @Autowired
    MemberMapper memberMapper;

    public Member search(MemberNumber memberNumber){
        return memberMapper.search(memberNumber);
    }
}
