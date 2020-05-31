package ex08;

@FunctionalInterface
interface Foo17 {
	String method(String string);
}

class UseFoo17 {
	
	public String add(String string, Foo17 foo) {
		return foo.method(string);
	}
	
}

public class LambdaEx17 {
	
	public static void main(String[] args) {
		
		UseFoo17 useFoo = new UseFoo17();
		Foo17 foo = parameter -> {
			return "Use class : " + parameter;
		};
		String result = useFoo.add("Farm", foo);
		
		System.out.println(result);
		
	}

}
