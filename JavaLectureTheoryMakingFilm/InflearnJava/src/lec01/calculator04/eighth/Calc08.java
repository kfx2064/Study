package lec01.calculator04.eighth;

public class Calc08 {
	
	public static void main(String[] args) {
		
		int first = 10;
		int second = 2;
		first = second >> 2;
		System.out.println("first : " + first);
		
		second = 2;
		first = second << 2;
		System.out.println("first << 2 : " + first);
		
		second = 2;
		first = second << 1;
		System.out.println("first << 1 : " + first);
		
	}

}
