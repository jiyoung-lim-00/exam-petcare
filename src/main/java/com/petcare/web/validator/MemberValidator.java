package com.petcare.web.validator;

import com.petcare.web.domain.Member;
import com.petcare.web.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MemberValidator implements Validator {

    @Autowired
    private MemberService memberService;

    @Override
    public boolean supports(Class<?> clazz) {
        return Member.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Member newMember = (Member) target;
        Member savedMember = memberService.getMemberWithUsername(newMember.getUsername());

        if(savedMember != null) {
            errors.rejectValue("username","duplicateUsername","이미 존재하는 유저이름입니다.");
        }
    }
}
