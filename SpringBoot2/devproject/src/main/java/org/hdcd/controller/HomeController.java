package org.hdcd.controller;

import org.apache.commons.io.IOUtils;
import org.hdcd.dto.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ClientInfoStatus;
import java.text.DateFormat;
import java.util.*;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/goHome1102", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> home1102() throws Exception {
        logger.info("home1102");

        String fileName = "aa.jpg";
        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        try {
            HttpHeaders headers = new HttpHeaders();
            in = new FileInputStream("C:\\" + "gyul.jpg");

            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.add("Content-Disposition", "attachment; filename=\"" + new String(fileName.getBytes("UTF-8")
                        , "ISO-8859-1") + "\"");

            entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        } finally {
            in.close();
        }
        return entity;
    }

    @RequestMapping(value = "/formHome", method = RequestMethod.GET)
    public String formHome() {
        return "formHome";
    }

    @RequestMapping(value = "/sub/goHome0102", method = RequestMethod.GET)
    public void home0102() {
        logger.info("home0102");
    }

    @RequestMapping(value = "/goHome0101", method = RequestMethod.GET)
    public void home0101() {
        logger.info("home0101");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {

        logger.info("HomeController");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formatterDate = dateFormat.format(date);

        model.addAttribute("serverTime", formatterDate);

        return "home";
    }

    @RequestMapping(value = "/ajaxHome", method = RequestMethod.GET)
    public String ajaxHome() {

        return "ajaxHome";
    }

    @RequestMapping(value = "/goHome0201", method = RequestMethod.GET)
    public String home0201() {
        logger.info("home0201");

        return "home0201";
    }

    @RequestMapping(value = "/sub/goHome0202", method = RequestMethod.GET)
    public String home0202() {
        logger.info("home0202");

        return "sub/goHome0202";
    }

    @RequestMapping(value = "/sub/goHome0203", method = RequestMethod.GET)
    public String home0203() {
        logger.info("home0203");

        return "sub/home0203";
    }

    @RequestMapping(value = "/goHome0204", method = RequestMethod.GET)
    public String home0204() {
        logger.info("home0204");

        return "redirect:/sub/goHome0203";
    }

    @RequestMapping(value = "/goHome0301", method = RequestMethod.GET)
    @ResponseBody
    public Member home0301() {
        logger.info("home0301");

        Member member = new Member();

        return member;
    }

    @RequestMapping(value = "/goHome04", method = RequestMethod.GET)
    @ResponseBody
    public List<Member> home04() {
        logger.info("home04");

        List<Member> list = new ArrayList<Member>();

        Member member = new Member();
        list.add(member);

        Member member2 = new Member();
        list.add(member2);

        return list;
    }

    @RequestMapping(value = "/goHome05", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Member> home05() {
        logger.info("home05");

        Map<String, Member> map = new HashMap<String, Member>();

        Member member = new Member();
        map.put("key1", member);

        Member member2 = new Member();
        map.put("key2", member2);

        return map;
    }

    @RequestMapping(value = "/goHome06", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Void> home06() {
        logger.info("home06");

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "goHome07", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> home07() {
        logger.info("home07");

        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }

    @RequestMapping(value = "/goHome08", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Member> home08() {
        logger.info("home08");

        Member member = new Member();

        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @RequestMapping(value = "/goHome09", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Member>> home09() {
        logger.info("home09");

        List<Member> list = new ArrayList<Member>();

        Member member = new Member();
        list.add(member);

        Member member2 = new Member();
        list.add(member2);

        return new ResponseEntity<List<Member>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/goHome10", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String, Member>> home10() {
        logger.info("home10");

        Map<String, Member> map = new HashMap<String, Member>();

        Member member = new Member();
        map.put("key1", member);

        Member member2 = new Member();
        map.put("key2", member2);

        return new ResponseEntity<Map<String, Member>>(map, HttpStatus.OK);
    }

    @RequestMapping(value = "/goHome1101", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> home1101() throws Exception {
        logger.info("home1101");

        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        try {
            HttpHeaders headers = new HttpHeaders();
            in = new FileInputStream("C:\\gyul.jpg");
            headers.setContentType(MediaType.IMAGE_JPEG);

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
