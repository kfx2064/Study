package ex04;

@FunctionalInterface
interface FooEight {
	String method(String string);
}

class UseFooEight {
	
	public String method(String string, FooEight foo) {
		return foo.method(string);
	}
	
}

public class Lambda08 {
	
	public static void main(String[] args) {
		
		UseFooEight useFoo = new UseFooEight();
		FooEight foo = parameter -> parameter + " from lambda.";
		String result = useFoo.method("Message good", foo);
		System.out.println(result);
		
	}

}
