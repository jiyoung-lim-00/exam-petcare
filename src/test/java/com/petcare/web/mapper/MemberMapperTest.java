package com.petcare.web.mapper;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Slf4j
public class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void exist_test() {

        String username = "govlmo91";
        String password = "1234";

        Member member = new Member(username, password);

        Member saved = memberMapper.getMember(member);

        log.debug(saved.toString());
        assertThat(saved.getUsername(), is(username));
        assertThat(saved.getPassword(), is(password));
    }
}