package ex06;

@FunctionalInterface
interface Foo {
	String method(String string);
}

class UseFooOne {
	
	private String value = "Enclosing scope value.";
	
	public String scopeExperimet() {
		Foo fooIC = new Foo() {
			
			String value = "Inner class value.";
			
			@Override
			public String method(String string) {
				// TODO Auto-generated method stub
				return this.value;
			}
		};
		String resultIC = fooIC.method("");
		
		Foo fooLambda = paramater -> {
			String value = "Lambda value";
			return this.value;
		};
		String resultLambda = fooLambda.method("");
		
		return "Results: resultIC = " + resultIC + ", resultLambda = " + resultLambda;
	}
	
}

public class Lambda01 {
	
	public static void main(String[] args) {
		
		UseFooOne foo = new UseFooOne();
		String result = foo.scopeExperimet();
		
		System.out.println(result);
		
	}

}
