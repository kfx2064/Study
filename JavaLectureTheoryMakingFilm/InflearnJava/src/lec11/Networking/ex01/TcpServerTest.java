package lec11.Networking.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerTest {
	
	public static void main(String[] args) {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(80);
			System.out.println("서버를 시작합니다.");
			System.out.println("=================================");
			
			while (true) {
				Socket socket = serverSocket.accept();
				
				synchronized (socket) {
					InetAddress inetAddress = socket.getInetAddress();
					System.out.println("클라이언트가 접속하였습니다.");
					System.out.println("getHostAddress ::: " + inetAddress.getHostAddress());
				}
				
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
								System.out.println("서버가 받은 데이터 ::: " + readLine);
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
						try {
							int count = 0;
							while (true) {
								Thread.sleep(1000);
								bw.write("서버에서 전송하는 데이터 [" + count + "]\r\n");
								count++;
								bw.flush();
							}
						} catch (Exception e) {
							e.printStackTrace();
							try {
								
							} catch(Exception e1) {
								e1.printStackTrace();
							}
						}
					}
				}.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
