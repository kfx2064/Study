package org.hdcd.devproject.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "boardNo")
@ToString
@Entity
public class Board implements Serializable {

    private static final long serialVersionUID = 8379774232276870327L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boardNo;

    private String title;
    private String writer;

    @Lob
    private String content;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;
}
