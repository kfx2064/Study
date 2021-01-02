package lec08.thread02.ninth;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		CustomThread customThread1 = new CustomThread();
		CustomThread customThread2 = new CustomThread();
		CustomThread customThread3 = new CustomThread();
		
		customThread1.start();
		customThread2.start();
		customThread3.start();
		
		customThread1.setAvailable(false);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		customThread1.setStop(true);
		customThread2.setStop(true);
		customThread3.setStop(true);
		
	}

}
