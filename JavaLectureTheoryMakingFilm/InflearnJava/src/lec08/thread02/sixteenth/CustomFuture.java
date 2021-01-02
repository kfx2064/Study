package lec08.thread02.sixteenth;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CustomFuture {
	
	public static String showDataMessage(String title, int size) {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(i + " 에외 발생 :: " + title);
				e.printStackTrace();
			}
			System.out.println(i + " 쓰레드 ::: " + title);
		}
		String strReturn = "쓰레드 종료 ::: " + title;
		return strReturn;
	}
	
	public static void main(String[] args) {
		
		ExecutorService executorServicePool = Executors.newFixedThreadPool(1);
		
		Future<String> futureFirst = executorServicePool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return showDataMessage("first thread", 3);
			}
		});
		
		Future futureSecond = executorServicePool.submit(new Runnable() {
			@Override
			public void run() {
				showDataMessage("second thread", 3);
			}
		});
		
		Future futureThird = executorServicePool.submit(new Runnable() {
			@Override
			public void run() {
				showDataMessage("third thread", 3);
			}
		});
		
		Future futureFourth = executorServicePool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return showDataMessage("네 번째 비교 쓰레드", 2);
			}
		});
		
		try {
			String returnData = futureFirst.get();
			System.out.println("첫 번째 쓰레드 리턴데이터 : " + returnData);
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		boolean deleteTask = futureThird.cancel(true);
		System.out.println("futureThird는 종료되었는가 ::: " + deleteTask);
		
		try {
			Object secondReturnData = futureSecond.get();
			System.out.println("두 번째 쓰레드 리턴데이터 : " + secondReturnData);
			Object fourthReturnData = futureFourth.get();
			System.out.println("네 번째 쓰레드 리턴데이터 : " + fourthReturnData);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
