package org.hdcd.devproject.domain;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board implements Serializable {

    private static final long serialVersionUID = 8379774232276870327L;

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;
}
