package lec08.exception01.second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsMain {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("c:/");
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
	}

}
