package ex02;

public class Lambda05 {
	
	public static void exec(Compare com) {
		int k = 5;
		int m = 6;
		int value = com.compareTo(k, m);
		System.out.println("Show num : " + value);
	}
	
	public static void main(String[] args) {
		
		exec((a, b) -> {
			System.out.println("Do lambda.");
			return a + b;
		});
		
	}

}
