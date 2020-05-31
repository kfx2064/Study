package ex08;

@FunctionalInterface
interface MF2 {
	void method();
}

public class LambdaEx10 {
	
	public static void main(String[] args) {
		
		MF2 mf = () -> {
			System.out.println("Do your best and wait your destiny.");
		};
		mf.method();
		
	}

}
