package com.petcare.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
public class ExamController {

    @GetMapping("/hi")
    public String hi() {
        return "홍창용님 안녕하세요.";
    }
}
