package org.hdcd.devproject.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "userNo")
@ToString(exclude = "memberDetail")
@Entity
public class Member {

    @Id
    @Column(name = "user_no")
    private Long userNo;

    private String userId;
    private String userPw;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_no")
    private MemberDetail memberDetail;

}
