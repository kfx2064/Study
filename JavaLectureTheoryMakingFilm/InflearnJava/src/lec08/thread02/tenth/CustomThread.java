package lec08.thread02.tenth;

public class CustomThread extends Thread {
	
	boolean available = true;
	boolean stop = false;
	
	public CustomThread() {
		
	}
	
	public CustomThread(int priority) {
		setPriority(priority);
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		int count = 0;
		
		while (!stop) {
			count++;
			System.out.println(name + " thread ::: " + count);
		}
	}
	
}
