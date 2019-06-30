package ex04;

@FunctionalInterface
interface Foo {
	String method(String string);
}

class UseFoo {
	public String add(String string, Foo foo) {
		return foo.method(string);
	}
}

public class Lambda01 {
	
	public static void main(String[] args) {
		Foo foo = parameter -> parameter + " from lambda.";
		UseFoo useFoo = new UseFoo();
		System.out.println(useFoo.add("Message", foo));
	}

}
