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
@ToString(exclude = "userItems")
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

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<UserItem> userItems = new ArrayList<UserItem>();

    public void addUserItem(UserItem userItem) {
        userItems.add(userItem);
    }

    public void removeUserItem(UserItem userItem) {
        userItems.remove(userItem);
    }

}
