package ex05;

import java.util.function.Function;

class UseFooThree {
	
	public String add(String string, Function<String, String> fn) {
		return fn.apply(string);
	}
	
}

public class Lambda03 {
	
	public static void main(String[] args) {
		
		Function<String, String> fn = parameter -> parameter + " from lambda.";
		UseFooThree useFoo = new UseFooThree();
		String result = useFoo.add("Message good", fn);
		System.out.println(result);
		
	}

}
