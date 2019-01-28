package org.zerock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.PDSBoard;
import org.zerock.domain.PDSFile;
import org.zerock.persistence.PDSBoardRepository;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
@Commit
public class PDSBoardTests {
	
	@Autowired
	PDSBoardRepository repo;
	
	@Test
	public void viewSummary() {
		repo.getSummary().forEach(arr -> log.info(Arrays.toString(arr)));
	}
	
	/*
	@Test
	public void insertDummies() {
		
		List<PDSBoard> list = new ArrayList<>();
		
		IntStream.range(1, 100).forEach(i -> {
			
			PDSBoard pds = new PDSBoard();
			pds.setPname("자료 " + i);
			
			PDSFile file1 = new PDSFile();
			file1.setPdsfile("file1.doc");
			
			PDSFile file2 = new PDSFile();
			file2.setPdsfile("file2.doc");
			
			pds.setFiles(Arrays.asList(file1, file2));
			
			log.info("try to save pds");
			
			list.add(pds);
			
		});
		
		repo.saveAll(list);
		
	}*/
	
	/*@Transactional
	@Test
	public void deletePDSFile() {
		// 첨부 파일 번호
		Long fno = 2L;
		
		int count = repo.deletePDSFile(fno);
		
		log.info("DELETE PDSFILE : " + count);
	}*/
	
	/*
	@Transactional
	@Test
	public void testUpdateFileName2() {
		
		Long fno = 2L;
		String newName = "updatedFile2.doc";
		
		int count = repo.updatePDSFile(fno, newName);
		// @Log 설정된 이후 사용 가능
		log.info("update count : " + count);
		
	}
	*/
	
	/*@Transactional
	@Test
	public void testUpdateFileName1() {
		Long fno = 1L;
		String newName = "updatedFile1.doc";
		
		int count = repo.updatePDSFile(fno, newName);
		// @Log 설정된 이후 사용 가능
		log.info("update count : " + count);
	}*/
	
	/*@Test
	public void testInsertPDS() {
		PDSBoard pds = new PDSBoard();
		pds.setPname("Document");
		
		PDSFile file1 = new PDSFile();
		file1.setPdsfile("file1.doc");
		
		PDSFile file2 = new PDSFile();
		file2.setPdsfile("file2.doc");
		
		pds.setFiles(Arrays.asList(file1, file2));
		
		log.info("try to save pds");
		
		repo.save(pds);
	}*/

}
