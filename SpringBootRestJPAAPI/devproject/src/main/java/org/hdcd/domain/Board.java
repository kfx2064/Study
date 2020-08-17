package org.hdcd.domain;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "boardNo")
public class Board implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;

}
