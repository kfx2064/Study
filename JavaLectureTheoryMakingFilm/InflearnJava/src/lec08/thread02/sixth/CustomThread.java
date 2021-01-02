package lec08.thread02.sixth;

public class CustomThread extends Thread {
	
	public void run() {
		Thread thread = Thread.currentThread();
		int count = 0;
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println(count + " : " + thread.getName());
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			count++;
		}
		System.out.println("쓰레드가 종료되었습니다.");
	}

}
