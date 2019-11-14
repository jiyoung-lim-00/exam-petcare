package com.petcare.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@Controller
@Slf4j
public class FormValueController {

    @GetMapping("/formTest")
    public String showForm() {
        return "formTest";
    }

    @PostMapping("/formTest")
    public ResponseEntity<String> formTest(@RequestBody String body) throws UnsupportedEncodingException {

        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @GetMapping("/hobby")
    public String hobbyForm() {
        return "hobby";
    }
    @PostMapping("/chkbox")
    @ResponseBody
    public String[] chkBox(@RequestParam String[] op) {
        return op;
    }
}
