package org.hdcd.devproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
public class Member {

    private String userId;
    private String password;
    private String userName;

    @Builder
    public Member(String userId, String password) {
        super();
        this.userId = userId;
        this.password = password;
    }

}
