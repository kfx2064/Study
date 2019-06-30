package ex03;

public class Lambda01 {
	
	@FunctionalInterface
	public interface MyNumber {
		int getMax(int a, int b);
	}
	
	public static void main(String[] args) {
		MyNumber max = (x, y) -> {
			if(x >= y) {
				return x;
			} else {
				return y;
			}
		};
		
		System.out.println(max.getMax(3, 4));
	}

}
