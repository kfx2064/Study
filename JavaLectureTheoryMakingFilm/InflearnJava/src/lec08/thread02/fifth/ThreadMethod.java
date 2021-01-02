package lec08.thread02.fifth;

public class ThreadMethod {
	
	public static void main(String[] args) {
		
		Thread firstThread = new CustomThread("first", 5);
		Thread secondThread = new CustomThread("second", 5);
		Thread thirdThread = new CustomThread("third", 5);
		Thread fourthThread = new CustomThread("fourth", 5);
		
		try {
			firstThread.start();
			System.out.println("첫 번째 쓰레드 join 실행");
		    firstThread.join();
		    
		    secondThread.start();
		    
		    thirdThread.start();
		    System.out.println("세 번째 쓰레드 join 실행");
		    thirdThread.join();
		    fourthThread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
