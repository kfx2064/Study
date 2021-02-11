package lec08.fileio04.second.stream.l;

import java.awt.Desktop;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputTest {
	
	public static void main(String[] args) {
		
		String strPath = "D:\\dev\\fileIOTest\\testOut.txt";
		
		DataOutputStream dataOutputStream = null;
		
		try {
			 
			dataOutputStream = new DataOutputStream(new FileOutputStream(strPath));
			
			byte[] bytes = "Human".getBytes();
			dataOutputStream.write(bytes);
			
			String strData1 = "Algorithm";
			String strData2 = "Data structure";
			String strData3 = "Programming";
			
			dataOutputStream.writeUTF(strData1); 
			dataOutputStream.writeUTF(strData2);
			dataOutputStream.writeUTF(strData3);
			
			Desktop.getDesktop().open(new File(strPath));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dataOutputStream != null) {
					dataOutputStream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
