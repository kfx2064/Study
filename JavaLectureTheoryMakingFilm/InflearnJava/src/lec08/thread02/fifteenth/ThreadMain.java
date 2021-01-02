package lec08.thread02.fifteenth;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ExecutorService executorServicePool = Executors.newFixedThreadPool(2);
		
		CustomRunnable customRunnable1 = new CustomRunnable("쓰레드1");
		CustomRunnable customRunnable2 = new CustomRunnable("쓰레드2");
		CustomRunnable customRunnable3 = new CustomRunnable("쓰레드3");
		CustomRunnable customRunnable4 = new CustomRunnable("쓰레드4");
		
		executorServicePool.execute(customRunnable1);
		executorServicePool.execute(customRunnable2);
		executorServicePool.execute(customRunnable3);
		
		executorServicePool.shutdownNow();
		
		executorServicePool.execute(customRunnable4);
		
		try {
			boolean at = executorServicePool.awaitTermination(3000, TimeUnit.MILLISECONDS);
			System.out.println("결과 : " + at);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 메서드 종료.");
	}

}
