package ex05;

import java.util.function.Function;

class UseFoo {
	public String add(String string, Function<String, String> fn) {
		return fn.apply(string);
	}
}

public class Lambda01 {

	public static void main(String[] args) {
		Function<String, String> fn = parameter -> parameter + " from lambda.";
		UseFoo useFoo = new UseFoo();
		String result = useFoo.add("Message", fn);
		System.out.println(result);
	}
	
}
