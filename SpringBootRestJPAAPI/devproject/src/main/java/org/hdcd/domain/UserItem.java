package org.hdcd.domain;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"userNo", "itemId"})
public class UserItem {

    private int userNo;
    private int itemId;

    private String itemName;
    private Integer price;
    private String description;

}
