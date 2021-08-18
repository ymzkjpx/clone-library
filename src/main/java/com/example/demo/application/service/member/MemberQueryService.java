package com.example.demo.application.service.member;

import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberQueryService {

    @Autowired
    MemberRepository memberRepository;

    /**
     * メンバー番号からメンバーを検索
     */
    public Member search(MemberNumber memberNumber) {
        return memberRepository.search(memberNumber);
    }
}
