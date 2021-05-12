package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.hdcd.devproject.domain.Member;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Slf4j
@Controller
public class HomeController {

    @ResponseBody
    @GetMapping("/goHome08")
    public ResponseEntity<Member> home08() {
        log.info("home08");

        Member member = new Member();

        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome09")
    public ResponseEntity<List<Member>> home09() {
        log.info("home09");

        List<Member> list = new ArrayList<Member>();

        Member member = new Member();
        list.add(member);

        Member member2 = new Member();
        list.add(member2);

        return new ResponseEntity<List<Member>>(list, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome10")
    public ResponseEntity<Map<String, Member>> home10() {
        log.info("home10");

        Map<String, Member> map = new HashMap<String, Member>();

        Member member = new Member();
        map.put("key1", member);

        Member member2 = new Member();
        map.put("key2", member2);

        return new ResponseEntity<Map<String, Member>>(map, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome1101")
    public ResponseEntity<byte[]> home1101() throws Exception {
        log.info("home1101");

        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        try {
            HttpHeaders headers = new HttpHeaders();

            in = new FileInputStream("C:\\TEMP\\sample.png");

            headers.setContentType(MediaType.IMAGE_PNG);

            entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        } finally {
            in.close();
        }
        return entity;
    }

    @ResponseBody
    @GetMapping(value = "/goHome1102")
    public ResponseEntity<byte[]> home1102() throws Exception {
        log.info("home1102");

        String fileName = "aa.zip";

        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        try {
            HttpHeaders headers = new HttpHeaders();

            in = new FileInputStream("C:\\TEMP\\" + fileName);

            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.add("Content-Disposition", "attachment; filename=\"" +
                    new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");

            entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        } finally {
            in.close();
        }
        return entity;
    }

}