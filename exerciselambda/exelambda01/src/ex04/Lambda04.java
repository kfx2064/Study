package ex04;

@FunctionalInterface
interface FooThree {
	String method(String string);
}

class UseFooThree {
	
	public String add(String string, FooThree foo) {
		return foo.method(string);
	}
	
}

public class Lambda04 {
	
	public static void main(String[] args) {
		
		UseFooThree useFoo = new UseFooThree();
		FooThree foo = parameter -> parameter + " from lambda.";
		String result = useFoo.add("Message", foo);
		System.out.println(result);
		
	}

}
