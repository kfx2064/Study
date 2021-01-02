package lec08.thread02.eighth;

public class CustomThread extends Thread {
	
	boolean suspend = false;
	boolean stop = false;
	
	public void thSuspend() {
		suspend = true;
	}
	
	public void thResume() {
		suspend = false;
	}
	
	public void thStop() {
		stop = true;
	}
	
	public void run() {
		int count = 0;
		while (stop == false) {
			System.out.println("thread가 동작 중입니다.");
			try {
				Thread.sleep(1000);
				if (suspend == false) {
					System.out.println(count + " : 쓰레드가 멈춤 없이 동작 중입니다.");
				}
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
