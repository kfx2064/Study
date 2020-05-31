package ex02;

@FunctionalInterface
interface FcLambda {
	void print(int a, int b);
}

class Calculate1 {
	
	public void calc(FcLambda fc) {
		System.out.println("Do calc.");
		fc.print(3, 4);
	}
	
}

public class Lambda03 {
	
	public static void main(String[] args) {
		Calculate1 calc = new Calculate1();
		
		calc.calc((a, b) -> {
			System.out.println("Non return lambda.");
			System.out.println(a + b);
			System.out.println("End.");
		});
	}

}
