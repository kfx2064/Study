package org.zerock.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;
import org.zerock.service.ReplyService;

import lombok.AllArgsConstructor;

@RequestMapping("/replies/")
@RestController
@AllArgsConstructor
public class ReplyController {
	
	private static final Logger logger = LoggerFactory.getLogger(ReplyController.class);
	
	private ReplyService service;
	
	@PostMapping(value = "/new", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> create(@RequestBody ReplyVO vo) {
		
		logger.info("ReplyVO : " + vo);
		
		int insertCount = service.register(vo);
		
		logger.info("Reply INSERT COUNT : " + insertCount);
		
		return insertCount == 1 
				? new ResponseEntity<>("success", HttpStatus.OK) 
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@GetMapping(value = "/pages/{bno}/{page}"
				, produces = {
						MediaType.APPLICATION_XML_VALUE
						, MediaType.APPLICATION_JSON_UTF8_VALUE
					})
	//public ResponseEntity<List<ReplyVO>> getList(@PathVariable("page") int page, @PathVariable("bno") Long bno) {
	public ResponseEntity<ReplyPageDTO> getList(@PathVariable("page") int page, @PathVariable("bno") Long bno) {
		
		logger.info("getList............");
		
		Criteria cri = new Criteria(page, 10);
		
		logger.info("get Reply List bno : " + bno);
		
		logger.info(cri.toString());
		
		return new ResponseEntity<>(service.getListPage(cri, bno), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{rno}", produces = { MediaType.APPLICATION_XML_VALUE
												, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") Long rno) {
		
		logger.info("get : " + rno);
		
		return new ResponseEntity<>(service.get(rno), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{rno}", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> remove(@PathVariable("rno") Long rno) {
		
		logger.info("remove : " + rno);
		
		return service.remove(rno) == 1 ? new ResponseEntity<>("success", HttpStatus.OK) 
										: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@RequestMapping(method = { RequestMethod.PUT, RequestMethod.PATCH },
					value = "/{rno}",
					consumes = "application/json",
					produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> modify(@RequestBody ReplyVO vo,
											@PathVariable("rno") Long rno) {
		
		vo.setRno(rno);
		
		logger.info("rno : " + rno);
		logger.info("modify : " + vo.toString());
		logger.info("voToString : " + vo.toString());
		
		return service.modify(vo) == 1
				? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
