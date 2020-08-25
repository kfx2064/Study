package org.hdcd.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString
public class MultiFileMember {

    private String userId;
    private String password;
    private List<MultipartFile> pictureList;

}
