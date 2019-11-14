package com.petcare.web.controller;

import com.petcare.web.domain.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@Slf4j
public class EventController {


    @GetMapping("/event/form")
    public String eventForm(@ModelAttribute Event event) {
        return "/event/form";
    }

    @PostMapping("/event/form")
    public String eventProcess(@Validated @ModelAttribute Event event, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/event/form";
        }
        return "redirect:/index";
    }
}
