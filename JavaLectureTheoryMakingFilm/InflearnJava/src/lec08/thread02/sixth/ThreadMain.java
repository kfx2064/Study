package lec08.thread02.sixth;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		Thread thread = new CustomThread();
		thread.start();
		try {
			Thread.sleep(3100);
		} catch(Exception e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
