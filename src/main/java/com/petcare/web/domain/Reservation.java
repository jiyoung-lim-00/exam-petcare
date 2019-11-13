package com.petcare.web.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class Reservation {

    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
}
