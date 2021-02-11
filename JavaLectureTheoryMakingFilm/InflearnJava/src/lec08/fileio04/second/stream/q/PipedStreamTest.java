package lec08.fileio04.second.stream.q;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamTest {
	
	public static void main(String[] args) {
		
		try {
			
			PipedInputStream pipedInputStream = new PipedInputStream();
			PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
			
			Thread oneThread = new Thread() {
				public void run() {
					int count = 0;
					try {
						while(true) {
							try {
								Thread.sleep(1000);
								String strData = "There is no easy day[" + count + "]";
								pipedOutputStream.write(strData.getBytes());
							} catch (Exception e) {
								e.printStackTrace();
							}
							count++;
						}
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			};
			oneThread.start();
			
			Thread twoThread = new Thread() {
				public void run() {
					byte[] bytes = new byte[1024];
					while (true) {
						try {
							Thread.sleep(1000);
							int readData = pipedInputStream.read(bytes);
							String strReadData = new String(bytes, 0, readData);
							
							System.out.println(strReadData);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			};
			twoThread.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
