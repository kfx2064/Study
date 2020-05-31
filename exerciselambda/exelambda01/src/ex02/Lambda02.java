package ex02;

@FunctionalInterface
interface CompOne {
	int add(int a, int b);
}

public class Lambda02 {
	
	public static void exec(CompOne com) {
		int k = 1;
		int m = 2;
		int value = com.add(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		exec((a, b) -> {
			System.out.println("Do lambda.");
			return a + b;
		});
		
	}

}
