package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.hdcd.devproject.domain.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @PostMapping(value = "/uploadAjax", produces = "text/plain; charset=utf-8")
    public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
        String originalFilename = file.getOriginalFilename();

        log.info("originalName : " + originalFilename);

        ResponseEntity<String> entity = new ResponseEntity<String>("UPLOAD SUCCESS " + originalFilename, HttpStatus.OK);

        return entity;
    }

}
