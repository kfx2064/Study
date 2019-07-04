package ex08;

@FunctionalInterface
interface MF12 {
	String method();
}

public class LambdaEx12 {
	
	public static void main(String[] args) {
		
		MF12 mf = () -> {
			return "get result.";
		};
		String result = mf.method();
		System.out.println(result);
		
	}

}
