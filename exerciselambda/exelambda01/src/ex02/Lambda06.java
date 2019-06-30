package ex02;

public class Lambda06 {
	
	public static void exec(Compare04 com) {
		
		int k = 5;
		int m = 2;
		int value = com.compareTo(k, m);
		System.out.println("Show num : " + value);
		
	}
	
	public static void main(String[] args) {
		
		exec((a, b) -> {
			System.out.println("Do lambda.");
			return 10 + b;
		});
		
	}

}
