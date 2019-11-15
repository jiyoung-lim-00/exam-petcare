package com.petcare.web.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    private String title;
    private String start;
    private String end;
}
