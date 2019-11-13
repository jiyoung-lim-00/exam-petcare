package com.petcare.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.Date;

@Getter @Setter
public class Event {
    @Min(value = 3, message = "최소 3글자 이상이어야합니다.")
    private String title;
    @Min(value = 2, message = "최소 2명 이상이어야합니다.")
    private Integer limit;
    @Email(message = "이메일의 형식이어야합니다.")
    private String email;

    private Date startDate;
    private Date endDate;
}
