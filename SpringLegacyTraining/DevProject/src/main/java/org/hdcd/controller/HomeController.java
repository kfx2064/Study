package org.hdcd.controller;

import org.apache.commons.io.IOUtils;
import org.hdcd.controller.domain.Card;
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

	@RequestMapping(value = "/home01", method = RequestMethod.GET)
	public String home01(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home01";
	}

	@RequestMapping(value = "/home02", method = RequestMethod.GET)
	public String home02(Model model) {
		logger.info("home2");

		Member member = new Member();

		member.setUserId("hongkd");
		member.setPassword("1234");
		member.setEmail("aaa@ccc.com");
		member.setUserName("홍길동");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 7);

		member.setDateOfBirth(cal.getTime());

		model.addAttribute(member);

		return "home02";
	}

	@RequestMapping(value = "/home03", method = RequestMethod.GET)
	public String home03(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home03";
	}

	@RequestMapping(value = "/home0101", method = RequestMethod.GET)
	public String home0101(Model model) {
		Member member = new Member();

		member.setUserId("hongkd");
		member.setPassword("1234");
		member.setEmail("aaa@ccc.com");
		member.setUserName("홍길동");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 7);

		member.setDateOfBirth(cal.getTime());

		model.addAttribute(member);

		return "home0101";
	}

	@RequestMapping(value = "/home0103", method = RequestMethod.GET)
	public String home0103(Model model) {
		Member member = new Member();

		member.setUserId("hongkd<>&\"");

		model.addAttribute(member);

		return "home0103";
	}

	@RequestMapping(value = "/home0104", method = RequestMethod.GET)
	public String home0104(Model model) {
		Member member = new Member();

		member.setUserId("hongkd<>&\"");

		model.addAttribute(member);

		return "home0104";
	}

	@RequestMapping(value = "/home0105", method = RequestMethod.GET)
	public String home0105(Model model) {
		Member member = new Member();

		model.addAttribute(member);

		return "home0105";
	}

	@RequestMapping(value = "/home0201", method = RequestMethod.GET)
	public String home0201(Model model) {
		/*int coin = 1000;

		model.addAttribute("coin", coin);

		return "home0201";*/
		Member member = new Member();

		member.setUserId("hongkd");

		model.addAttribute(member);

		return "home0201";
	}

	@RequestMapping(value = "/home0202", method = RequestMethod.GET)
	public String home0202(Model model) {
		/*int coin = 1000;

		model.addAttribute("coin", coin);

		return "home0202";*/
		Member member = new Member();

		member.setUserId("hongkd");

		model.addAttribute(member);

		return "home0202";
	}

	@RequestMapping(value = "/home0203", method = RequestMethod.GET)
	public String home0203(Model model) {
		Member member = new Member();

		member.setUserId("hongkd");

		model.addAttribute(member);

		return "home0203";
	}

	@RequestMapping(value = "home0204", method = RequestMethod.GET)
	public String home0204(Model model) {
		Member member = new Member();

		model.addAttribute(member);

		return "home0204";
	}

	@RequestMapping(value = "/home0301", method = RequestMethod.GET)
	public String home0301(Model model) {
		Member member = new Member();

		member.setUserId("hongkd");

		model.addAttribute(member);

		return "home0301";
	}

	@RequestMapping(value = "/home0401", method = RequestMethod.GET)
	public String home0401(Model model) {
		/*int coin = 1000;
		String userId = "hongkd";
		Member member = new Member();

		model.addAttribute("coin", coin);
		model.addAttribute("userId", userId);

		model.addAttribute("member", member);

		return "home0401";*/
		Member member = new Member();

		String[] hobbyArray = {"Music", "Movie"};

		member.setHobbyArray(hobbyArray);

		model.addAttribute(member);

		return "home0401";
	}

	@RequestMapping(value = "/home0402", method = RequestMethod.GET)
	public String home0402(Model model) {
		return "home0402";
	}

	@RequestMapping(value = "/home0501", method = RequestMethod.GET)
	public String home0501(Model model) {
		Member member = new Member();

		model.addAttribute(member);

		return "home0501";
	}

	@RequestMapping(value = "/home0502", method = RequestMethod.GET)
	public String home0502(Model model) {
		Member member = new Member();

		member.setForeigner(true);

		model.addAttribute(member);

		return "home0502";
	}

	@RequestMapping(value = "/home0601", method = RequestMethod.GET)
	public String home0601(Model model) {
		Member member = new Member();

		model.addAttribute(member);

		return "home0601";
	}

	@RequestMapping(value = "/home0602", method = RequestMethod.GET)
	public String home0602(Model model) {
		Member member = new Member();

		member.setGender("F");

		model.addAttribute(member);

		return "home0601";
	}

	@RequestMapping(value = "/home0603", method = RequestMethod.GET)
	public String home0603(Model model) {
		Member member = new Member();

		member.setGender("M");

		model.addAttribute(member);

		return "home0601";
	}

	@RequestMapping(value = "/home0701", method = RequestMethod.GET)
	public String home0701(Model model) {
		Member member = new Member();

		String[] hobbyArray = {"Music", "Movie"};

		member.setHobbyArray(hobbyArray);

		model.addAttribute(member);

		return "home0701";
	}

	@RequestMapping(value = "/home0702", method = RequestMethod.GET)
	public String home0702(Model model) {
		Member member = new Member();

		List<String> hobbyList = new ArrayList<>();
		hobbyList.add("Music");
		hobbyList.add("Movie");

		member.setHobbyList(hobbyList);

		model.addAttribute(member);

		return "home0702";
	}

	@RequestMapping(value = "/home0703", method = RequestMethod.GET)
	public String home0703(Model model) {
		Member member = new Member();

		List<Card> cardList = new ArrayList<>();

		Card card1 = new Card();
		card1.setNo("123456");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.DAY_OF_MONTH, 8);

		card1.setValidMonth(cal.getTime());

		cardList.add(card1);

		Card card2 = new Card();
		card2.setNo("456786");

		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 7);

		card2.setValidMonth(cal.getTime());

		cardList.add(card2);

		member.setCardList(cardList);

		model.addAttribute(member);

		return "home0703";
	}

	@RequestMapping(value = "/home0801", method = RequestMethod.GET)
	public String home0801(Model model) {
		Member member = new Member();

		String hobby = "Music,Movie";

		member.setHobby(hobby);

		model.addAttribute(member);

		return "home0801";
	}

	@RequestMapping(value = "/home0901", method = RequestMethod.GET)
	public String home0901(Model model) {
		return "home0901";
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
	public String goHome0203() {
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

	@RequestMapping(value = "/registerForm3", method = RequestMethod.GET)
	public String registerForm3() {
		logger.info("registerForm3");

		return "registerForm3";
	}
	
}
