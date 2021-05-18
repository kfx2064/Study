package org.hdcd.devproject.domain;

import lombok.*;
import org.hdcd.devproject.constant.Gender;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "userNo")
@Entity
public class Member {

    @Id
    private String userId;

    private String userPw;
    private String userName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDateTime joinDate;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

}
