package ex04;

@FunctionalInterface
interface FooTwo {
	String method(String string);
}

class UseFooTwo {
	public String add(String string, FooTwo foo) {
		return foo.method(string);
	}
}

public class Lambda03 {

	public static void main(String[] args) {
		
		FooTwo foo = parameter -> parameter + " from lambda.";
		UseFooTwo useFoo = new UseFooTwo();
		String result = useFoo.add("Message", foo);
		System.out.println(result);
		
	}
	
}
