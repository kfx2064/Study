package lec08.thread02.thirteenth;

public class CustomRunnable implements Runnable {
	
	private String name;
	
	public CustomRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int index = 0;
		while (true) {
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
				break;
			}
			System.out.println(index + " ::: " + name);
			index++;
		}
	}
	
}
