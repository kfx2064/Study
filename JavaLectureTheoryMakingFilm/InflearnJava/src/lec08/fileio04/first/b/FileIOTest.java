package lec08.fileio04.first.b;

import java.io.File;

public class FileIOTest {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\dev\\test.txt");
		
		boolean fileExists = file.exists();
		if (fileExists == false) {
			file.mkdirs();
		}
		System.out.println("폴더가 존재합니까? : " + fileExists);
		
		File notExistsFile = new File("C:\\dev\\fileFolder\\test.txt");
		if (notExistsFile.exists() == false) {
			System.out.println("notExistsFile이 없습니다.");
			File folderPath = notExistsFile.getAbsoluteFile().getParentFile();
			if (folderPath.exists() == false) {
				boolean folderpathMkdirs = folderPath.mkdirs();
				if (folderpathMkdirs == true) {
					System.out.println("notExistsFile 폴더를 만들었습니다.");
				}
				try {
					notExistsFile.createNewFile();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("notExistsFile 생성되었는가? : " + notExistsFile.exists());
		
	}

}
