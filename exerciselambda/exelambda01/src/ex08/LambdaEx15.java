package ex08;

@FunctionalInterface
interface Foo15 {
	String method(String string);
}

class UseFoo15 {
	public String add(String string, Foo15 foo) {
		return foo.method(string);
	}
}

public class LambdaEx15 {
	
	public static void main(String[] args) {
		
		UseFoo15 useFoo = new UseFoo15();
		Foo15 foo = parameter -> parameter + " from lambda.";
		String result = useFoo.add("Show message", foo);
		System.out.println(result);
		
	}

}
