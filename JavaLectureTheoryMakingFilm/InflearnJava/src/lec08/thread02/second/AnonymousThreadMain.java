package lec08.thread02.second;

public class AnonymousThreadMain {
	
	public static void showMessage(String message, int time) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(time);
				System.out.println("메시지 " + i + " : " + message);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method start.");
		
		Thread firstThread = new Thread() {
			@Override
			public void run() {
				showMessage("첫번째 쓰레드", 1000);
			}
		};
		
		Thread secondThread = new Thread() {
			@Override
			public void run() {
				showMessage("두번째 쓰레드", 1500);
			}
		};
		
		Thread thirdThread = new Thread(new Runnable() {
			@Override
			public void run() {
				showMessage("첫 runnable", 2000);
			}
		});
		
		Thread fourthThread = new Thread(new Runnable() {
			@Override
			public void run() {
				showMessage("두번째 runnable", 2500);;
			}
		});
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();
		fourthThread.start();
		
		System.out.println("Main method end.");
		
	}

}
