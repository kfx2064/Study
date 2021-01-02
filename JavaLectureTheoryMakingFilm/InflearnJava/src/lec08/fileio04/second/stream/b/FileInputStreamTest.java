package lec08.fileio04.second.stream.b;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileInputStreamTest {
	
	public static void main(String[] args) {
		
		FileInputStream fileInputStream = null;
		FileReader fileReader = null;
		
		try {
			
			fileInputStream = new FileInputStream("C:\\dev\\test.txt");
			
			while (true) {
				int read = fileInputStream.read();
				if (read == -1) {
					break;
				}
				char readChar = (char) read;
				System.out.print(readChar);
			}
			
			fileReader = new FileReader("C:\\dev\\test.txt");
			
			while (true) {
				int read = fileReader.read();
				if (read == -1) {
					break;
				}
				char readChar = (char) read;
				System.out.print(readChar);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		 
	}

}
