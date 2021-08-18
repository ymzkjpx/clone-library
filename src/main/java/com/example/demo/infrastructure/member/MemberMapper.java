package com.example.demo.infrastructure.member;

import com.example.demo.domain.model.member.Member;
import com.example.demo.domain.model.member.MemberNumber;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    Member search(MemberNumber memberNumber);
}
