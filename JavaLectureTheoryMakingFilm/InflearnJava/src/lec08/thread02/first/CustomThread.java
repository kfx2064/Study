package lec08.thread02.first;

public class CustomThread extends Thread {
	
	private String message;
	private int time;
	
	public CustomThread(String message, int time) {
		this.message = message;
		this.time = time;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(time);
				System.out.println("Thread ¸Þ½ÃÁö : " + message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
