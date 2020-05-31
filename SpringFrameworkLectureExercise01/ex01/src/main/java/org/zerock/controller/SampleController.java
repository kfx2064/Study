package org.zerock.controller;


import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
	
	private static Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	public void basic() {
		
		logger.info("basic........................");
		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void initPage() { 
		logger.info("start....");
	}
	
	// 날짜 등의 형식이 2019-03-19로 들어와도 자동으로 Date 포맷으로 변환시켜 주는 것
	/*
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
	}
	*/
	
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		
		logger.info("basic get.......................");
		
	}
	
	@RequestMapping(value = "/basicOnlyGet", method = RequestMethod.GET)
	public void basicGet2() {
		
		logger.info("basic get only get...............");
		
	}
	
	@RequestMapping(value = "/ex01", method = RequestMethod.GET)
	public String ex01(SampleDTO dto) {
		
		logger.info("" + dto);
		
		return "ex01";
	}
	
	@RequestMapping(value = "/ex02", method = RequestMethod.GET)
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		logger.info("name : " + name);
		logger.info("age : " + age);
		
		return "ex02";
	}
	
	@RequestMapping(value = "/ex02List", method = RequestMethod.GET)
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		
		logger.info("ids : " + ids);
		
		return "ex02List";
	}
	
	@RequestMapping(value = "/ex02Bean", method = RequestMethod.GET)
	public String ex02Bean(SampleDTOList list) {
		
		logger.info("list dtos : " + list);
		
		return "ex02Bean";
	}
	
	@RequestMapping(value = "/ex03", method = RequestMethod.GET)
	public String ex03(TodoDTO todo) {
		
		logger.info("todo : " + todo);
		
		return "ex03";
	}
	
	@RequestMapping(value = "/ex04", method = RequestMethod.GET)
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		
		logger.info("dto : " + dto);
		logger.info("page : " + page);
		
		return "/sample/ex04";
	}
	
	@RequestMapping(value = "/ex06", method = RequestMethod.GET)
	public @ResponseBody SampleDTO ex06() {
		
		logger.info("ex06..............");
		
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
		
		logger.info("여기까지 진행");
		
		return dto;
	}
	
	
	@RequestMapping(value = "/ex07", method = RequestMethod.GET)
	public ResponseEntity<String> ex07() {
		
		logger.info("/ex07............");
		
		// {"name" : 홍길동}
		String msg = "{\"name\": \"홍길동\"}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<String>(msg, header, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/exUpload", method = RequestMethod.GET)
	public String exUpload() {
		
		logger.info("/exUpload.............");
		
		return "/sample/exUpload";
	}
	
	
	@RequestMapping(value = "/exUploadPost", method = RequestMethod.POST)
	public void exUploadPost(ArrayList<MultipartFile> good) {
		
		logger.info("왜 안 타!!!!!!");
		
		int fileSize = good.size();
		System.out.println("파일사이즈 : " + fileSize);
		
		for(int i = 0; i < fileSize; i++) {
			MultipartFile getFile = good.get(i);
			
			logger.info("-----------------------------------------");
			logger.info("name : " + getFile.getOriginalFilename());
			logger.info("size : " + getFile.getSize());
		}
		
	}
	

}
