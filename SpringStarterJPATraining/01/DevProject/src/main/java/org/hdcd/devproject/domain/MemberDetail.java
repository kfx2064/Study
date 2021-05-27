package org.hdcd.devproject.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "memberDetailNo")
@ToString
@Entity
@Table(name = "member_detail")
public class MemberDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_detail_no")
    private Long memberDetailNo;

    private String userName;
    private String email;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    @OneToOne
    @JoinColumn(name = "user_no")
    private Member member;

}
