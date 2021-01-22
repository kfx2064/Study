package org.hdcd.domain;

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

    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private Date regDate;
    private Date updDate;

    private List<MemberAuth> authList;

    private String password;
    private String email;
    private String gender;
    private String hobby;
    private String[] hobbyArray;
    private List<String> hobbyList;
    private boolean foreigner;
    private String developer;
    private String nationality;

    private Address address;

    private List<Card> cardList;

    private String cars;
    private String[] carArray;
    private List<String> carList;

    private String introduction;

    private int coin = 100;

    private Date dateOfBirth;
    private String birthDay;

}
