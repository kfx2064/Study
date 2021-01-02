package lec08.thread02.seventeenth;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTestMain {
	
	public static void main(String[] args) {
		
		CompletableFuture completableFuture = new CompletableFuture();
		
		Thread thread = new Thread() {
			public void run() {
				int i = 0;
				for (i = 0; i < 2; i++) {
					try {
						Thread.sleep(1000);
					} catch(Exception e) {
						e.printStackTrace();
					}
					System.out.println("i : " + i);
				}
				completableFuture.complete(i);
			}
		};
		
		thread.start();
		System.out.println("쓰레드 start.");
		
		try {
			Object getData = completableFuture.get();
			System.out.println("결과(i) : " + getData);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
