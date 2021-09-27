package org.hdcd.devproject.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Member {

    private String userName = "hongkd";
    private String password = "1234";
    private int coin = 100;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date dateOfBirth;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
