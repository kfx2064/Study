package ex04;

@FunctionalInterface
interface FooSeven {
	String method(String string);
}

class UseFooSeven {
	
	public String add(String string, FooSeven foo) {
		return foo.method(string);
	}
	
}

public class Lambda07 {
	
	public static void main(String[] args) {
		
		UseFooSeven useFoo = new UseFooSeven();
		FooSeven foo = parameter -> parameter + " from lambda.";
		String result = useFoo.add("Message useFoo", foo);
		System.out.println(result);
		String resultFoo = foo.method("Good");
		System.out.println(resultFoo);
		
	}

}
