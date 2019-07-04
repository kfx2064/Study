package ex08;

@FunctionalInterface
interface Foo6 {
	void method();
}

class UseFoo6 {
	
	
	
}

public class LambdaEx6 {
	
	public static void main(String[] args) {
		
		Foo6 foo6 = () -> System.out.println("show message.");
		foo6.method();
		
	}

}
