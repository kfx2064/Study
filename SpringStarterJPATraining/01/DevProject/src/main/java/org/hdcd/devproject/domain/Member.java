package org.hdcd.devproject.domain;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @NotBlank
    private String userId;

    private String password;

    @NotBlank
    @Size(max = 3)
    private String userName;

    private String email;
    private String gender;

}
