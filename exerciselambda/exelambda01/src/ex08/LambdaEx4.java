package ex08;

@FunctionalInterface
interface Foo2 {
	String method(String string);
}

class UseFoo2 {
	
	public String add(String string, Foo2 foo2) {
		return foo2.method(string);
	}
	
}

public class LambdaEx4 {

	public static void main(String[] args) {
		
		UseFoo2 useFoo2 = new UseFoo2();
		Foo2 foo2 = parameter -> parameter + " from lambda.";
		String result = useFoo2.add("Message", foo2);
		System.out.println(result);
		
	}
	
}
