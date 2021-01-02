package lec08.fileio04.first.d;

import java.io.File;

public class FileIOTest {
	
	public static void main(String[] args) {
		
		File fileOrigin = new File("C:\\dev\\FileIOTest\\changeFile\\test.txt");
		File fileChange = new File("C:\\dev\\FileIOTest\\changeFile\\good.txt");
		
		fileOrigin.renameTo(fileChange);
		
	}

}
