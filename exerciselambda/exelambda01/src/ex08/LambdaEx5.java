package ex08;

@FunctionalInterface
interface Foo5 {
	String method(String string);
}

class UseFoo5 {
	
	public String add(String string, Foo5 foo5)	{
		return foo5.method(string);
	}
	
}

public class LambdaEx5 {

	public static void main(String[] args) {
		
		UseFoo5 useFoo5 = new UseFoo5();
		Foo5 foo5 = parameter -> parameter + " from lambda.";
		String result = useFoo5.add("Message", foo5);
		System.out.println(result);
		
	}
	
}
