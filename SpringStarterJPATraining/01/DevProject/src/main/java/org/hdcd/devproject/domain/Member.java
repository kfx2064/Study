package org.hdcd.devproject.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private String userId = "hongkd";
    private String password = "1234";
    private Address address;
    private List<Card> cardList;

}
