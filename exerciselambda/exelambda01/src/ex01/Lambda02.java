package ex01;

@FunctionalInterface
interface SayDoLogic {
	int something(int a, int b);
}

class PersonSay {
	public void doLogic(SayDoLogic logic) {
		int number = logic.something(2, 5);
		System.out.println("Number is " + number);
	}
}

public class Lambda02 {

	public static void main(String[] args) {
		PersonSay ps = new PersonSay();
		ps.doLogic(new SayDoLogic() {
			
			@Override
			public int something(int a, int b) {
				
				System.out.println("non lambda logic.");
				
				return a + b;
			}
		});
		
		ps.doLogic((a, b) -> {
			System.out.println("lambda logic.");
			
			return a + b + 1;
		});
	}
	
}
