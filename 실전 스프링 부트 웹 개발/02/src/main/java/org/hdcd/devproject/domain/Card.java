package org.hdcd.devproject.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Card implements Serializable {

    private static final long serialVersionUID = -7902796834016106638L;

    private String no;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date validMonth;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(Date validMonth) {
        this.validMonth = validMonth;
    }
}
