package lec08.fileio04.second.stream.c;

import java.io.FileInputStream;

public class UseByteArray {
	
	public static void main(String[] args) {
		
		FileInputStream fileInputStream = null;
		
		try {
			
			fileInputStream = new FileInputStream("C:\\dev\\test.txt");
			
			byte[] bytes = new byte[20];
			
			while (true) {
				int read = fileInputStream.read(bytes);
				
				if (read == -1) {
					break;
				}
				
				String getData = new String(bytes, 0, read);
				System.out.println(getData);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
 