package ex08;

@FunctionalInterface
interface Mf14 {
	String method(String string);
}

public class LambdaEx14 {
	
	public static void main(String[] args) {
		
		Mf14 mf = parameter -> {
			return "plus " + parameter;
		};
		String result = mf.method("oops");
		System.out.println(result);
		
	}

}
