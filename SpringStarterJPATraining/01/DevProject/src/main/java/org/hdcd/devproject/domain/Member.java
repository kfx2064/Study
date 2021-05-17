package org.hdcd.devproject.domain;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @NotBlank
    private String userId;

    private String userName;

    private String email;

}
