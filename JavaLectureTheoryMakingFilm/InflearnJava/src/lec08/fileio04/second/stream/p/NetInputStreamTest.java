package lec08.fileio04.second.stream.p;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NetInputStreamTest {
	
	public static void main(String[] args) {
		
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		
		try {
			
			URL url = new URL("http://www.google.co.kr");
			URLConnection urlConnection = url.openConnection();
			inputStream = urlConnection.getInputStream();
			
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			
			while (true) {
				String strReadLine = bufferedReader.readLine();
				if (strReadLine == null) {
					break;
				}
				System.out.println(strReadLine);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
