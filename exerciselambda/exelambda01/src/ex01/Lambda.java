package ex01;

@FunctionalInterface
interface Say {
	int something(int a, int b);
}

class Person {
	
	public void hi(Say line) {
		int number = line.something(5, 6);
		System.out.println("Number is " + number);
	}
	
	public static int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
	
}


public class Lambda {
	
	public static void main(String[] args) {
		
		Person rin = new Person();
		
		rin.hi((a, b) -> { 
			System.out.println("My Name is Coding-Factory.");
			System.out.println("Nice to meet you.");
			System.out.println("Parameter number is " + a + ", " + b); 
			return a + b; 
		});
	 
	}	
}

