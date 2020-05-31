package ex08;

@FunctionalInterface
interface MF {
	void method();
}

public class LambdaEx9 {

	public static void main(String[] args) {
		
		MF mf = () -> {
			System.out.println("Do or do not. There is not try.");
		};
		mf.method();
		
	}
	
}
