package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");

        return "registerForm";
    }

    @PostMapping("/registerFile01")
    public String registerFile01(MultipartFile picture) throws Exception {
        log.info("registerFile01");

        log.info("originalName: " + picture.getOriginalFilename());
        log.info("size: " + picture.getSize());
        log.info("contentType: " + picture.getContentType());

        return "success";
    }

    @PostMapping("registerFile02")
    public String registerFile02(String userId, String password, MultipartFile picture) throws Exception {
        log.info("registerFile02");

        log.info("userId = " + userId);
        log.info("password = " + password);

        log.info("originalName: " + picture.getOriginalFilename());
        log.info("size: " + picture.getSize());
        log.info("contentType: " + picture.getContentType());

        return "success";
    }

    @PostMapping("/registerFile03")
    public String registerFile03(Member member, MultipartFile picture) throws Exception {
        log.info("registerFile03");

        log.info("userId = " + member.getUserId());
        log.info("password = " + member.getPassword());

        log.info("originalName : " + picture.getOriginalFilename());
        log.info("size : " + picture.getSize());
        log.info("contentType : " + picture.getContentType());

        return "success";
    }

    @PostMapping("/registerFile04")
    public String registerFile04(FileMember fileMember) throws Exception {
        log.info("registerFile04");

        log.info("userId = " + fileMember.getUserId());
        log.info("password = " + fileMember.getPassword());

        MultipartFile picture = fileMember.getPicture();

        log.info("originalName : " + picture.getOriginalFilename());
        log.info("size : " + picture.getSize());
        log.info("contentType : " + picture.getContentType());

        return "success";
    }

    @PostMapping("/registerFile05")
    public String registerFile05(MultipartFile picture, MultipartFile picture2) throws Exception {
        log.info("registerFile05");

        log.info("picture originalName: " + picture.getOriginalFilename());
        log.info("picture size: " + picture.getSize());
        log.info("picture contentType: " + picture.getContentType());

        log.info("picture2 originalName: " + picture2.getOriginalFilename());
        log.info("picture2 size: " + picture2.getSize());
        log.info("picture2 contentType: " + picture2.getContentType());

        return "success";
    }

    @PostMapping("/registerFile06")
    public String registerFile06(List<MultipartFile> pictureList) throws Exception {
        log.info("registerFile06");

        log.info("registerFile06 pictureList.size() = " + pictureList.size());

        for (MultipartFile picture : pictureList) {
            log.info("picture originalName : " + picture.getOriginalFilename());
            log.info("picture size : " + picture.getSize());
            log.info("picture contentType : " + picture.getContentType());
        }

        return "success";
    }

    @PostMapping("/registerFile07")
    public String registerFile07(MultiFileMember multiFileMember) throws Exception {
        log.info("registerFile07");

        List<MultipartFile> pictureList = multiFileMember.getPictureList();

        log.info("registerFile07 pictureList.size() = " + pictureList.size());

        for (MultipartFile picture : pictureList) {
            log.info("picture originalName : " + picture.getOriginalFilename());
            log.info("picture size : " + picture.getSize());
            log.info("picture contentType : " + picture.getContentType());
        }

        return "success";
    }

    @PostMapping("/registerFile08")
    public String registerFile08(MultipartFile[] pictureList) throws Exception {
        log.info("registerFile08");

        log.info("registerFile08 pictureList.length = " + pictureList.length);

        for (MultipartFile picture : pictureList) {
            log.info("picture originalName: " + picture.getOriginalFilename());
            log.info("picture size: " + picture.getSize());
            log.info("picture contentType: " + picture.getContentType());
        }

        return "success";
    }

}
