package org.hdcd.devproject.domain;

import lombok.*;

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

}
