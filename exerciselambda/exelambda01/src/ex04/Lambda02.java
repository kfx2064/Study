package ex04;

@FunctionalInterface
interface FooOne {
	String method(String string);
}

class UseFooOne {
	
	public String add(String string, FooOne foo) {
		return foo.method(string);
	}
	
}

public class Lambda02 {

	public static void main(String[] args) {
		FooOne foo = parameter -> parameter + " from lambda.";
		UseFooOne useFoo = new UseFooOne();
		String result = useFoo.add("Message", foo);
		System.out.println("result : " + result);
	}
	
}
