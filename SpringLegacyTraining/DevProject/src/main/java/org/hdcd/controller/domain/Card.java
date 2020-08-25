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
public class Card implements Serializable {

    private static final long serialVersionUID = -2707945640869551938L;

    private String no;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date validMonth;

}
