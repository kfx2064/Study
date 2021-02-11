package lec11.Networking.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpClientTest {
	
	public static void main(String[] args) {
		
		try {
			
			Socket socket = new Socket("localhost", 80);
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			new Thread() {
				public void run() {
					BufferedReader br = new BufferedReader(new InputStreamReader(is));
					try {
						while (true) {
							String readLine = br.readLine();
							if (readLine == null) {
								break;
							}
							System.out.println("클라이언트가 받은 데이터 ::: " + readLine);
						}
					} catch (Exception e) {
						e.printStackTrace();
						try {
							socket.close();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				}
			}.start();
			
			new Thread() {
				public void run() {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
					int count = 0;
					try {
						while (true) {
							try {
								Thread.sleep(2000);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							bw.write("클라이언트에서 전송하는 데이터 [" + count + "\r\n");
							count++;
							bw.flush();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
 