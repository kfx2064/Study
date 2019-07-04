package ex08;

@FunctionalInterface
interface Foo16 {
	String method(String string);
}

class UseFoo16 {
	
	public String add(String string, Foo16 foo) {
		return foo.method(string);
	}
	
}

public class LambdaEx16 {
	
	public static void main(String[] args) {
		
		UseFoo16 useFoo = new UseFoo16();
		Foo16 foo = parameter -> {
			return "Get Paramter : " + parameter;
		};
		
		String result = useFoo.add("Total", foo);
		
		System.out.println(result);
		
	}

}
