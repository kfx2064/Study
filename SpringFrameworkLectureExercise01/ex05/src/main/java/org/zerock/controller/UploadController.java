package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.java.Log;

@Controller
@Log
public class UploadController {

	@GetMapping("/uploadForm") 
	public void uploadForm() {
		
		log.info("upload form");
		
	}
	
	//@PostMapping("/uploadFormAction")
	@RequestMapping(value = "/uploadFormAction", method = RequestMethod.POST
					, headers = "content-type=multipart/form-data")
	public void uploadFormPost(@RequestParam MultipartFile[] uploadFile, Model model) {
		
		System.out.println("시작되었음.");
		
		for(MultipartFile multipartFile : uploadFile) {
			
			log.info("---------------------------------------------");
			log.info("Upload File Name : " + multipartFile.getOriginalFilename());
			log.info("Upload File Size : " + multipartFile.getSize());
			
		}
		
	}
	
}
