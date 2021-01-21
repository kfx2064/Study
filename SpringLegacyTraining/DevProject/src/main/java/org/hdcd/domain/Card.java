package org.hdcd.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Card implements Serializable {

    private static final long serialVersionUID = -2707945640869551938L;

    @NotBlank
    private String no;

    @Future
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date validMonth;

}
