package org.hdcd.devproject.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private String userId;
    private String password;

    private String userName;

    private String email;
    private String gender;

    private LocalDate dateOfBirth;

    private Address address;

    private List<Card> cardList;

    private String hobby;

    private String[] hobbyArray;
    private List<String> hobbyList;

}
