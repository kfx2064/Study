package org.hdcd.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Member implements Serializable {

    private static final long serialVersionUID = -8660095590680225320L;

    @NotBlank
    private String userId;
    @NotBlank
    private String password;

    @NotBlank
    @Size(max = 3)
    private String userName;
    @Email
    private String email;
    private String gender;
    private String hobby;
    private String[] hobbyArray;
    private List<String> hobbyList;
    private boolean foreigner;
    private String developer;
    private String nationality;

    @Valid
    private Address address;

    @Valid
    private List<Card> cardList;

    private String cars;
    private String[] carArray;
    private List<String> carList;

    private String introduction;

    private int coin = 100;

    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String birthDay;

}
