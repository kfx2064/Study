package lec08.fileio04.second.stream.d;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		
		FileOutputStream fileOutputStream = null;
		
		try {
			
			fileOutputStream = new FileOutputStream("C:\\dev\\testOut.txt");
			
			fileOutputStream.write((int) 'E');
			fileOutputStream.write((int) 'a');
			fileOutputStream.write((int) 's');
			fileOutputStream.write((int) 'y');
			fileOutputStream.write((int) ' ');
			fileOutputStream.write((int) 'd');
			fileOutputStream.write((int) 'a');
			fileOutputStream.write((int) 'y');
			fileOutputStream.write((int) ' ');
			fileOutputStream.write((int) 'i');
			fileOutputStream.write((int) 's');
			fileOutputStream.write((int) ' ');
			fileOutputStream.write((int) 'y');
			fileOutputStream.write((int) 'e');
			fileOutputStream.write((int) 's');
			fileOutputStream.write((int) 't');
			fileOutputStream.write((int) 'e');
			fileOutputStream.write((int) 'r');
			fileOutputStream.write((int) 'd');
			fileOutputStream.write((int) 'a');
			fileOutputStream.write((int) 'y');
			fileOutputStream.write((int) '\n');
			
			String strData = "한국";
			byte[] sourceBytes = strData.getBytes();
			fileOutputStream.write(sourceBytes);
			
			Desktop.getDesktop().open(new File("C:\\dev\\testOut.txt"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
