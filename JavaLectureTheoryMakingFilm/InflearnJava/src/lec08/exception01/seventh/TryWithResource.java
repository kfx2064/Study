package lec08.exception01.seventh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\test.txt"))) {
			
			while (true) {
				String strData = br.readLine();
				if (strData != null) {
					System.out.println(strData);
				} else {
					break;
				}
			}
			
		} catch (FileNotFoundException fe ) {
			fe.printStackTrace();
 		} catch (IOException ie) {
 			ie.printStackTrace();
 		} 		
	}

}
