package org.hdcd.devproject.domain;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"member", "item"})
@ToString
public class UserItemId implements Serializable {

    private static final long serialVersionUID = -310396447956830659L;

    private Long member;
    private Long item;
}
