package org.hdcd.devproject.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import java.time.YearMonth;

@Getter
@Setter
@ToString
public class Card {

    @NotBlank
    private String no;

    @Future
    private YearMonth validMonth;

}
