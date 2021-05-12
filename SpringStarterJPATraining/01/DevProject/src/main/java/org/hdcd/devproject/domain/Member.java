package org.hdcd.devproject.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private String userId = "hongkd";
    private String password = "1234";
    private String userName;
    private int coin = 100;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate dateOfBirth;

}
