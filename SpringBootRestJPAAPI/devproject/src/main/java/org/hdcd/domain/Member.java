package org.hdcd.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {

    private String userId = "hongkd";
    private String password = "1234";
    private String userName;

}
