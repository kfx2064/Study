package ex08;

@FunctionalInterface
interface Foo1 {
	String method(String string);
}

class UseFoo3 {
	
	public String add(String string, Foo1 foo) {
		return foo.method(string);
	}
	
}

public class LambdaEx3 {
	
	public static void main(String[] args) {
		
		UseFoo3 useFoo3 = new UseFoo3();
		Foo1 foo1 = parameter -> parameter + " from lambda.";
		String result = useFoo3.add("Message", foo1);
		
		System.out.println(result);
		
	}

}
