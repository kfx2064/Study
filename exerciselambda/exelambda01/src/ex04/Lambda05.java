package ex04;

@FunctionalInterface
interface FooFour {
	String method(String string);
}

class UseFooFour {
	public String add(String string, FooFour foo) {
		return foo.method(string);
	}
}

public class Lambda05 {

	public static void main(String[] args) {
		
		UseFooFour useFoo = new UseFooFour();
		FooFour foo = parameter -> parameter + " from lambda.";
		String result = useFoo.add("Message111", foo);
		System.out.println(result);
		
	}
	
}
