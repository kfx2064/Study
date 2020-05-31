package ex08;

@FunctionalInterface
interface Mf13 {
	String method(String string);
}

public class LambdaEx13 {
	
	public static void main(String[] args) {
		
		Mf13 mf = parameter -> {
			
			return "plus " + parameter; 
		};
		String result = mf.method("put in string.");
		
		System.out.println(result);
		
	}

}
