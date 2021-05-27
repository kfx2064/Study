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
@ToString
@Entity
@IdClass(UserItemId.class)
public class UserItem {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_no")
    private Member member;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_no")
    private Item item;

    private int amount;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

}
