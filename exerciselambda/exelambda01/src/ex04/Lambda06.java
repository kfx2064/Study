package ex04;

@FunctionalInterface
interface FooFive {
	String method(String string);
}

class UseFooFive {
	public String add(String string, FooFive foo) {
		return foo.method(string);
	}
}

public class Lambda06 {
	
	public static void main(String[] args) {
		UseFooFive useFoo = new UseFooFive();
		FooFive foo = parameter -> parameter + " from lambda.";
		String result = useFoo.add("Message Good", foo);
		System.out.println(result);
	}

}
