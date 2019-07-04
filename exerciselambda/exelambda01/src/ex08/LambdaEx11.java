package ex08;

@FunctionalInterface
interface MF11 {
	void method();
}

public class LambdaEx11 {
	
	public static void main(String[] args) {
		
		MF11 mf = () -> {
			System.out.println("Life is simple. Try and get result.");			
		};
		mf.method();
		
	}

}
