package lec04.OOP8;

public class FactorialTest {
	
	public static int methodFactorial(int one) {
		if (one < 0) {
			return -1;
		}
		if (one == 0 || one == 1) {
			return 1;
		}
		
		int returnValue = one * methodFactorial(one - 1);
		System.out.println(one + " * factorial(" + (one - 1) + ") = " + returnValue);
		return returnValue;
	}
	
	public static void main(String[] args) {
		int resultValue = methodFactorial(5);
		System.out.println("°á°ú°ª : " + resultValue);
	}

}
