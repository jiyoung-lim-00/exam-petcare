package com.petcare.web.controller;

import com.petcare.web.config.RootConfig;
import com.petcare.web.config.ServletConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class})
@WebAppConfiguration
public class MemberControllerTest {

    @Autowired
    private MemberController memberController;

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void exist_controller() {
        assertThat(mockMvc, is(notNullValue()));
        assertThat(memberController,is(notNullValue()));
    }

    @Test
    public void loginForm() throws Exception {
        mockMvc.perform(get("/loginForm"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("loginForm"));

    }

    @Test
    public void loginProcess() throws Exception {
        mockMvc.perform(post("/loginProcess")
                    .param("username","govlmo91")
                    .param("password", "1234"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(request().sessionAttribute("username", "govlmo91"));
    }
}