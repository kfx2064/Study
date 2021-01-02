package lec08.thread02.eighth;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("쓰레드 실습을 진행합니다.");
			System.out.println();
			
			CustomThread customThread = new CustomThread();
			customThread.start();
			
			Thread thread = new Thread() {
				public void run() {
					System.out.println("서브 쓰레드를 시작합니다.");
					try {
						Thread.sleep(3500);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
					
					System.out.println("본 쓰레드를 멈춥니다.");
					customThread.thSuspend();
					
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println("본 쓰레드를 재시작합니다.");
					customThread.thResume();
					
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println("본 쓰레드를 멈춥니다.");
					customThread.thStop();
				}
			};
			
			thread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
 