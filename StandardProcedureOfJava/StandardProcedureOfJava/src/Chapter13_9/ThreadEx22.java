package Chapter13_9;

public class ThreadEx22 {

	public static void main(String[] args) {
		Runnable r = new RunnableEx22();
		new Thread(r).start();
		new Thread(r).start();
	}
	
}

class Account {
	private int balance = 1000;		// private으로 해야 동기화가 의미있다.
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	} // withdraw
}

class RunnableEx22 implements Runnable {
	
	Account acc = new Account();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(acc.getBalance() > 0) {
			// 100, 200, 300 중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}	// run()
	
}