package lec08.thread02.third;

public class ThreadStatus {
	
	public static void showThreadStatus() {
		
		Thread thread = Thread.currentThread();
		
		ThreadGroup threadGroup = thread.getThreadGroup();
		String threadGroupName = threadGroup.getName();
		int threadGroupIntActiveGroupCount = threadGroup.activeGroupCount();
		int threadGroupIntActiveCount = threadGroup.activeCount();
		
		String threadName = thread.getName();
		int threadPriority = thread.getPriority();
		Thread.State threadState = thread.getState();
		
		System.out.println("쓰레드그룹명 : " + threadGroupName);
		System.out.println("쓰레드그룹액티브그룹개수 : " + threadGroupIntActiveGroupCount);
		System.out.println("쓰레드그룹액티브개수 : " + threadGroupIntActiveCount);
		System.out.println("쓰레드명 : " + threadName);
		System.out.println("쓰레드우선순위 : " + threadPriority);
		System.out.println("쓰레드스탯 : " + threadState);
		
	}
	
	public static void main(String[] args) {
		
		ThreadGroup threadGroup = new ThreadGroup("쓰레드그룹");
		
		Thread firstThread = new Thread(threadGroup, "첫번째 쓰레드") {
			public void run() {
				try {
					Thread.sleep(1500);
					showThreadStatus();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		showThreadStatus();
		firstThread.start();
		
	}

}
