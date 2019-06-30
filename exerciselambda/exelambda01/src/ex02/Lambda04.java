package ex02;

@FunctionalInterface
interface Compare04 {
	public int compareTo(int a, int b);
}

public class Lambda04 {

	public static void exec04(Compare04 com) {
		int k = 1;
		int m = 2;
		int value = com.compareTo(k, m);
		System.out.println("Show num : " + value);
	}
	
	public static void main(String[] args) {
		exec04((a, b) -> {
			System.out.println("Do logic.");
			return a + b;
		});
	}
	
}
