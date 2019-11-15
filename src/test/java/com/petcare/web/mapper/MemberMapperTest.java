package com.petcare.web.mapper;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Slf4j
@WebAppConfiguration
public class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    @Transactional
    public void exist_test() {

        String username = "govlmo91";
        String password = "123456";

        Member member = new Member(username, password);

        Member saved = memberMapper.findByUsername(member.getUsername());

        log.debug(saved.toString());
        assertThat(saved.getUsername(), is(username));
        assertThat(saved.getPassword(), is(password));
    }
}