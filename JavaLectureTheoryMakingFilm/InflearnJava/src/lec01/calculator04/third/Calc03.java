package lec01.calculator04.third;

public class Calc03 {
	
	public static void main(String[] args) {
		
		int var1 = 10;
		int sum1 = var1++;
		System.out.println("sum1 : " + sum1);
		
		int var2 = 10;
		int sum2 = ++var2;
		System.out.println("sum2 : " + sum2);
		
		int var3 = 10;
		int min3 = var3--;
		
		int var4 = 10;
		int min4 = --var4;
		
		System.out.println("min3 : " + min3);
		System.out.println("min4 : " + min4);
		
	}

}
