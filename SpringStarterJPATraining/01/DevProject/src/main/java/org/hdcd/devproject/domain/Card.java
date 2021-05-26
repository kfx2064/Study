package org.hdcd.devproject.domain;

import lombok.*;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"cardNo", "validMonth"})
@ToString
@Embeddable
public class Card {

    private String cardNo;
    private String validMonth;

}
