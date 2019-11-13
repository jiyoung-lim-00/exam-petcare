package com.petcare.web.controller;

import com.petcare.web.domain.Member;
import com.petcare.web.service.MemberService;
import com.petcare.web.validator.MemberValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberValidator memberValidator;

    @InitBinder
    private void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(memberValidator);
    }

    @GetMapping("/loginForm")
    public String loginForm(Model model) {
        model.addAttribute("member", new Member());
        return "loginForm";
    }

    @PostMapping("/loginProcess")
    public String loginProcess(@ModelAttribute Member member, Model model) {
        Member saved = memberService.getCorrectMember(member);
        if (saved != null) {
            model.addAttribute("member", saved);
            return "redirect:/index";
        }

        return "redirect:/loginForm";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/index";
    }

    @GetMapping("/signupForm")
    public String signupForm(Model model) {
        model.addAttribute(new Member());
        return "signupForm";
    }

    @PostMapping("/signupForm")
    public String signupProcess(@Valid @ModelAttribute Member member, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().stream().map(e -> toString()).forEach(log::debug);
            return "signupForm";
        }
        memberService.insertMember(member);
        return "index";
    }

}
