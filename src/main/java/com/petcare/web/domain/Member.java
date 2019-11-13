package com.petcare.web.domain;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Member {
    private Long uId;

    @NonNull
    @NotEmpty
    @Size(min = 4, message = "네 글자 이상이어야합니다.")
    private String username;

    @NonNull
    @NotEmpty
    @Size(min = 6, message = "여섯글자 이상이어야 합니다.")
    private String password;

    @Email
    private String email;
}
