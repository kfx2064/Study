package org.hdcd.devproject.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
public class FileMember {

    private String userId;

    private String password;

    private MultipartFile picture;

}
