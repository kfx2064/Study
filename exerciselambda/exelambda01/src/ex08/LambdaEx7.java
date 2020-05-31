package ex08;

@FunctionalInterface
interface Foo7 {
	void method();
}

public class LambdaEx7 {
	
	public static void main(String[] args) {
		
		Foo7 foo7 = () -> {System.out.println("Show default message.");};
		foo7.method();
		
	}

}
