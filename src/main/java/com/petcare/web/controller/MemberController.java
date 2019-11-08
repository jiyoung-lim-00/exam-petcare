package com.petcare.web.controller;

import com.petcare.web.domain.Member;
import com.petcare.web.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/loginForm")
    public String loginForm(Model model) {
        model.addAttribute("member", new Member());
        return "loginForm";
    }

    @PostMapping("/loginProcess")
    public String loginProcess(@ModelAttribute Member member, Model model) {
        model.addAttribute("member", memberService.getMember(member));
        return "redirect:/index";
    }

}
