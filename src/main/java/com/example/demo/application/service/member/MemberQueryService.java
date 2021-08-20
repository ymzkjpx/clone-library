package com.example.demo.application.service.member;

import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
import com.example.demo.domain.model.member.loan.MemberStatus;
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

    /**
     * 会員の存在を確認する
     */
    public MemberStatus status(MemberNumber memberNumber) {
        return memberRepository.status(memberNumber);
    }
}
