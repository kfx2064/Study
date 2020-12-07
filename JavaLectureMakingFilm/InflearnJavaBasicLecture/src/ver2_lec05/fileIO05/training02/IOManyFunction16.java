package ver2_lec05.fileIO05.training02;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Calendar;

public class IOManyFunction16 {
	
	public static void main(String[] args) {
		
		/**
		 * [프로그램] <> [소켓] <> [포트] <> [아이피] <> 인터넷 <> [아이피] <> [포트] <> [소켓] <> [프로그램]
		 */
		
		try {
			
			PipedInputStream pis = new PipedInputStream();
			PipedOutputStream pos = new PipedOutputStream(pis);
			
			Thread thread1 = new Thread() {
				public void run() {
					try {
						while (true) {
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}
							
							String time = Calendar.getInstance().getTime().toString();
							pos.write(time.getBytes());
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			thread1.start();
			
			Thread thread2 = new Thread() {
				public void run() {
					byte[] byteBowl = new byte[1024];
					while (true) {
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						try {
							int read = pis.read(byteBowl);
							System.out.println(new String(byteBowl, 0, read));
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			};
			thread2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
