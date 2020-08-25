package org.hdcd.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Member implements Serializable {

    private String userId = "hongkd";
    private String password = "1234";
    private int coin = 100;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date dateOfBirth;

}
