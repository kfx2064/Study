package lec01.calculator04.second;

public class Calc02 {
	
	public static void main(String[] args) {
		
		int intVar1 = 10;
		int intVar2 = 2;
		intVar1 += intVar2;
		System.out.println("intVar1 : " + intVar1);
	
		intVar1 = 10;
		intVar2 = 2;
		intVar1 = intVar1 + intVar2;
		System.out.println("intVar1 : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 2;
		intVar1 -= intVar2;
		System.out.println("빼기 : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 2;
		intVar1 *= intVar2;
		System.out.println("곱하기 : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 2;
		intVar1 = intVar1 * intVar2;
		System.out.println("곱하기 풀어쓰기 : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 3;
		intVar1 %= intVar2;
		System.out.println("나누고 남은 나머지 : " + intVar1);
		
	}

}
