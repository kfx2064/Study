package ex01;

interface add {
	int something(int a, int b);
}

class OtherPerson {
	public void add(Say line) {
		int number = line.something(1, 2);
		System.out.println("Number is " + number);
	}
}

public class Lambda01 {

	public static void doLogic() {
		OtherPerson op = new OtherPerson();
		op.add(new Say() {
			public int something(int a, int b) {
				
				System.out.println("rolling non-lambda logic.");
				
				return a + b;
			}
		});
	}
	
	public static void main(String[] args) {
		doLogic();
	}
	
}
