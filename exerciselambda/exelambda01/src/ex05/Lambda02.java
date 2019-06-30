package ex05;

import java.util.function.Function;

class UseFooTwo {
	
	public String add(String string, Function<String, String> fn) {
		return fn.apply(string);
	}
	
}

public class Lambda02 {
	
	public static void main(String[] args) {
		
		Function<String, String> fn = parameter -> parameter + " from lambda.";
		UseFooTwo useFoo = new UseFooTwo();
		String result = useFoo.add("Message good", fn);
		System.out.println(result);
		
	}

}
