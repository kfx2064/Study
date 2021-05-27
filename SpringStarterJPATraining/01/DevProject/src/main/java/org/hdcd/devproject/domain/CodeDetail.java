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
@EqualsAndHashCode(of = "codeDetailNo")
@ToString(exclude = "codeGroup")
@Entity
public class CodeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codeDetailNo;

    private String codeValue;

    private String codeName;
    private int sortSeq;
    private String useYn = "Y";

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    @ManyToOne
    @JoinColumn(name = "group_code")
    private CodeGroup codeGroup;

}
