package ex01;

@FunctionalInterface
interface Say6 {
	int something(int a, int b);
}

class Person6 {
	
	public void add(Say6 say6) {
		System.out.println("Person class.");
		int number = say6.something(5, 6);
		System.out.println("show your number : " + number);
	}
	
}

public class Lambda06 {
	
	public static void main(String[] args) {
		
		Person6 ps6 = new Person6();
		ps6.add(new Say6() {
			
			@Override
			public int something(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("non lambda.");
				return a + b - 10;
			}
		});
		
		ps6.add((a, b) -> {
			
			System.out.println("lambda logic.");
			
			return a + b + 10;
			
		});
		
	}

}
