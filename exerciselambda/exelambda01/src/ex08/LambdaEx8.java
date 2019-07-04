package ex08;

@FunctionalInterface
interface MyFunction8 {
	void method();
}

public class LambdaEx8 {
	
	public static void main(String[] args) {
		
		MyFunction8 mf = () -> System.out.println("Show default coding.");
		mf.method();
		
	}

}
