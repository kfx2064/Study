package lec08.lambda05.first;

public class Lambda01 {
	
	public static void main(String[] args) {
		
		Calculate add = (x, y) -> x + y;
		Calculate substract = (int x, int y) -> x - y;
		Calculate multiply = (x, y) -> {
			return x * y;
		};
		Calculate divide = (int x, int y) -> {
			return x / y;
		};
		
		int resultAdd = add.doCalc(100, 20);
		System.out.println("더하기 : " + resultAdd);
		int resultSubs = substract.doCalc(100, 20);
		System.out.println("빼기 : " + resultSubs);
		int resultMultiply = multiply.doCalc(100, 20);
		System.out.println("곱하기 : " + resultMultiply);
		int resultDivide = divide.doCalc(100, 20);
		System.out.println("나누기 : " + resultDivide);
		
	}
	
	interface Calculate {
		int doCalc(int x, int y);
	}

}
 