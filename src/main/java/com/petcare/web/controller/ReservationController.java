package com.petcare.web.controller;

import com.petcare.web.domain.Reservation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class ReservationController {

    @GetMapping("/reservationForm")
    public String reservationForm(Model model) {
        model.addAttribute(new Reservation());
        return "reservationForm";
    }

    @PostMapping("/reservationProcess")
    public String reservationProcess(@RequestParam Reservation reservation) {
        log.debug(reservation.toString());
        return "redirect:index";
    }
}
