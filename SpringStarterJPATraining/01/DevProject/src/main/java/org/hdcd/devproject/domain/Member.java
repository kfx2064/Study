package org.hdcd.devproject.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "userNo")
@ToString(exclude = "items")
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_no")
    private Long userNo;
    private String userId;
    private String userPw;
    private String userName;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    @ManyToMany
    @JoinTable(name = "user_item", joinColumns = @JoinColumn(name = "user_no"),
        inverseJoinColumns = @JoinColumn(name = "item_no"))
    private List<Item> items = new ArrayList<Item>();

}
