package org.hdcd.devproject.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "itemNo")
@ToString(exclude = "members")
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_no")
    private Long itemNo;

    private String itemName;
    private Integer price;
    private String description;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    @ManyToMany(mappedBy = "items")
    private List<Member> members = new ArrayList<Member>();

    public void addMember(Member member) {
        members.add(member);

        member.getItems().add(this);
    }

    public void removeMember(Member member) {
        members.remove(member);

        member.getItems().remove(this);
    }
}
