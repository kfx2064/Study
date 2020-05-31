package ex01;

@FunctionalInterface
interface Say5 {
	int something(int a, int b);
}

class Person5 {
	
	public void hi5(Say5 say5) {
		int number = say5.something(2, 5);
		System.out.println("Number is " + number);
	}
	
}

public class Lambda05 {

	public static void main(String[] args) {
		
		Person5 ps5 = new Person5();
		
		ps5.hi5(new Say5() {
			
			@Override
			public int something(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("do non lambda.");
				return a + b + 2;
			}
		});
		
		ps5.hi5((a, b) -> {
			System.out.println("do something throw lambda.");
			return a + b - 5;
		});
		
	}
	
}
