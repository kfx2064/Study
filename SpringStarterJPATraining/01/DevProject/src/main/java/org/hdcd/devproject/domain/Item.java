package org.hdcd.devproject.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "item2")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;

    @Column(length = 50)
    private String itemName;

    private Integer price;

    @Column(length = 250)
    private String description;

    @Transient
    private List<MultipartFile> pictures;

    @Column(length = 200)
    private String pictureUrl;

    @Column(length = 200)
    private String pictureUrl2;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

}
