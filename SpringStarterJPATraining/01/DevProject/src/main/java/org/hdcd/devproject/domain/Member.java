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
@ToString
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userNo;

    private String userId;
    private String userPw;
    private String userName;

    @ElementCollection
    @CollectionTable(
            name = "member_card",
            joinColumns = @JoinColumn(name = "user_no")
    )
    @OrderColumn(name = "sub_seq")
    private List<Card> cardList;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    public void remove(int index) {
        cardList.remove(index);
    }

    public Card getCard(int index) {
        return cardList.get(index);
    }

}
