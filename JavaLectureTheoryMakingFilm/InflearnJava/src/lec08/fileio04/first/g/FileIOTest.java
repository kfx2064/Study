package lec08.fileio04.first.g;

import java.io.File;

public class FileIOTest {
	
	public static void main(String[] args) {
		
		try {
			
			File newTempFile = 
					File.createTempFile("tempFile_", ".temp", new File("C:\\dev\\FileIOTest\\tempFile"));
			Thread.sleep(3000);
			
			newTempFile.deleteOnExit();
			System.out.println("임시파일 ::: " + newTempFile.getAbsolutePath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
