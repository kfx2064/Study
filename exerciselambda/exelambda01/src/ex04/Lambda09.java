package ex04;

@FunctionalInterface
interface FooNine {
	String method(String string);
}

public class Lambda09 {

	public static void main(String[] args) {
		FooNine foo = parameter -> parameter + " from lambda.";
		String result = foo.method("Message");
		System.out.println(result);
	}
	
}
