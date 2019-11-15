package com.petcare.web.controller;

import com.petcare.web.domain.Reservation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
public class CalendarController {

    @GetMapping("/calendar")
    public String calendar() {
        return "calendar/calendar";
    }

    @PostMapping(value = "/calendar-exam", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Reservation> exam() {
        List<Reservation> reservationList = new ArrayList<>();
        Reservation reservation = new Reservation("타이틀", "2019-11-01", "2019-11-02");
        Reservation reservation2 = new Reservation("sad", "2019-11-15", "2019-11-06");
        reservationList.add(reservation);
        reservationList.add(reservation2);

        return reservationList;
    }
}
