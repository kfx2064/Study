package Chapter14_8;

public class MyFunctionalInterfaceExample {
	
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(3, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(4, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

}
