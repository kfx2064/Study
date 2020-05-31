package ex01;

@FunctionalInterface
interface Say3 {
	int something(int a, int b);
}

class Person3 {
	public void add(Say3 line) {
		int number = line.something(3, 4);
		System.out.println("Number is " + number);
	}
}

public class Lambda03 {
	
	public static void main(String[] args) {
		
		Person3 ps3 = new Person3();
		
		ps3.add(new Say3() {
			
			@Override
			public int something(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("calculate somthing to use non lambda.");
				
				return a + b;
			}
		});
		
		ps3.add((a, b) -> {
			System.out.println("use lambda logic to calculate something.");
			
			return a + b + 7;
		});
		
	}
	
}
