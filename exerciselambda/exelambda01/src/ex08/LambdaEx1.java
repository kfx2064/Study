package ex08;

@FunctionalInterface
interface Foo {
	String method(String string);
}

class UseFoo {
	
	public String add(String string, Foo foo) {
		return foo.method(string);
	}
	
}

public class LambdaEx1 {
	
	public static void main(String[] args) {
		Foo foo = parameter -> parameter + " from lambda";
		UseFoo useFoo = new UseFoo();
		String result = useFoo.add("Message", foo);
		
		System.out.println(result);
	}

}
