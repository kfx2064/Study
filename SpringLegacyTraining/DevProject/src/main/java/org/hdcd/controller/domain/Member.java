package org.hdcd.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Member implements Serializable {

    private String userId = "hongkd";
    private String password = "1234";

    private String userName;
    private String email;
    private String gender;
    private String hobby;
    private String[] hobbyArray;
    private List<String> hobbyList;
    private boolean foreigner;
    private String developer;
    private String nationality;

    private Address address;

    private List<Card> cardList;

    private String cars;
    private String[] carArray;
    private List<String> carList;

    private String introduction;

    private int coin = 100;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date dateOfBirth;
    private String birthDay;

}
