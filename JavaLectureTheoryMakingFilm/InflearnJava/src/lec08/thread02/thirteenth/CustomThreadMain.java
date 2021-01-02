package lec08.thread02.thirteenth;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadMain {
	
	public static void main(String[] args) {
		
		ExecutorService executorServicePool = Executors.newFixedThreadPool(4);
		
		Runnable rn1 = new CustomRunnable("Runnable1");
		Runnable rn2 = new CustomRunnable("Runnable2");
		
		Callable<String> call1 = new CustomCallable("Callable1");
		Callable<String> call2 = new CustomCallable("Callable2");
		
		executorServicePool.execute(rn1);
		
		executorServicePool.submit(rn2);
		executorServicePool.submit(call1);
		executorServicePool.submit(call2);
		
		System.out.println("메인 메서드 종료.");
		
	}

}
