package com.petcare.web.service;

import com.petcare.web.domain.Member;
import com.petcare.web.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public Member getCorrectMember(Member member) {
        return memberMapper.findCorrectUser(member);
    }

    public Member getMemberWithUsername(String username) {
        return memberMapper.findByUsername(username);
    }

    public void insertMember(Member member) {
        memberMapper.insertMember(member);
    }
}
