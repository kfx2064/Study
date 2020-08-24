package org.hdcd.controller;

import org.apache.commons.io.IOUtils;
import org.hdcd.controller.domain.Member;
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

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	@RequestMapping(value = "/goHome0101", method = RequestMethod.GET)
	public void home0101() {
		logger.info("home0101");
	}

	@RequestMapping(value = "/sub/goHome0102", method = RequestMethod.GET)
	public void home0102() {
		logger.info("home0102");
	}

	@RequestMapping(value = "/goHome0201", method = RequestMethod.GET)
	public String home0201() {
		logger.info("home0201");

		return "home0201";
	}

	@RequestMapping(value = "/sub/goHome0202", method = RequestMethod.GET)
	public String home0202() {
		logger.info("home0202");

		return "home0202";
	}

	@RequestMapping(value = "/sub/goHome0203", method = RequestMethod.GET)
	public String home0203() {
		logger.info("home0203");

		return "sub/home0203";
	}

	@RequestMapping(value = "/goHome0204", method = RequestMethod.GET)
	public String home0204() {
		logger.info("home0204");

		return "redirect:/sub/goHome0205";
	}

	@RequestMapping(value = "/sub/goHome0205", method = RequestMethod.GET)
	public String home0205() {
		logger.info("home0205");

		return "/sub/home0205";
	}

	@ResponseBody
	@RequestMapping(value = "/goHome0301", method = RequestMethod.GET)
	public Member home0301() {
		logger.info("home0301");

		Member member = new Member();

		return member;
	}

	@ResponseBody
	@RequestMapping(value = "/goHome04", method = RequestMethod.GET)
	public List<Member> home04() {
		logger.info("home04");

		List<Member> list = new ArrayList<Member>();

		Member member = new Member();
		list.add(member);

		Member member1 = new Member();
		list.add(member1);

		return list;
	}

	@ResponseBody
	@RequestMapping(value = "/goHome06", method = RequestMethod.GET)
	public ResponseEntity<Void> home06() {
		logger.info("home06");

		return new ResponseEntity<>(HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value = "/goHome07", method = RequestMethod.GET)
	public ResponseEntity<String> home07() {
		logger.info("home07");

		return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value = "/goHome08", method = RequestMethod.GET)
	public ResponseEntity<Member> home08() {
		logger.info("home08");

		Member member = new Member();

		return new ResponseEntity<>(member, HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value = "/goHome09", method = RequestMethod.GET)
	public ResponseEntity<List<Member>> home09() {
		logger.info("home09");

		List<Member> list = new ArrayList<>();

		Member member = new Member();
		list.add(member);

		Member member1 = new Member();
		list.add(member1);

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value = "/goHome10", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Member>> home10() {
		logger.info("home10");

		Map<String, Member> map = new HashMap<>();

		Member member = new Member();
		map.put("key1", member);

		Member member1 = new Member();
		map.put("key2", member1);

		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value = "/goHome1101", method = RequestMethod.GET)
	public ResponseEntity<byte[]> home1101() throws Exception {
		logger.info("home1101");

		InputStream in = null;
		ResponseEntity<byte[]> entity = null;

		try {
			HttpHeaders headers = new HttpHeaders();

			in = new FileInputStream("D:\\TEMP\\sample.png");

			headers.setContentType(MediaType.IMAGE_PNG);

			entity = new ResponseEntity<>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} finally {
			in.close();
		}

		return entity;
	}

	@ResponseBody
	@RequestMapping(value = "/goHome1102", method = RequestMethod.GET)
	public ResponseEntity<byte[]> home1102() throws Exception {
		logger.info("home1102");

		String fileName = String.valueOf("sample.png");

		InputStream in = null;
		ResponseEntity<byte[]> entity = null;

		try {
			HttpHeaders headers = new HttpHeaders();

			in = new FileInputStream("D:\\TEMP\\" + fileName);

			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.add("Content-Disposition", "attachment; filename=\""
					+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");

			entity = new ResponseEntity<>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} finally {
			in.close();
		}

		return entity;
	}
	
}
