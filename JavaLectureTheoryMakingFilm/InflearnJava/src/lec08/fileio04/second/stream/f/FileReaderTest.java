package lec08.fileio04.second.stream.f;

import java.io.FileReader;

public class FileReaderTest {
	
	public static void main(String[] args) {
		
		FileReader fileReader = null;
		
		try {
			
			String strFilePath = "D:\\dev\\fileIOTest\\test.txt";
			
			fileReader = new FileReader(strFilePath);
			
			while (true) {
				int read = fileReader.read();
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (fileReader != null) {
					fileReader.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
 