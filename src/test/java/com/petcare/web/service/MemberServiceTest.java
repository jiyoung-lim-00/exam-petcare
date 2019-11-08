package com.petcare.web.service;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Slf4j
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void exist_test() {
      log.info(memberService.toString());
    }

    @Test
    public void getMember_test() {
        Member member = new Member("govlmo91","1234");
        Member saved = memberService.getMember(member);

        assertThat(saved, is(notNullValue()));
    }
}