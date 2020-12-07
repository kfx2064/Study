package lec01.calculator04.forth;

public class Calc04 {
	
	public static void main(String[] args) {
		
		int whileCnt = 0;
		while (whileCnt < 5) {
			System.out.println("반복문++ : " + whileCnt++ + " 입니다.\t");
		}
		System.out.println();
		whileCnt = 0;
		while (whileCnt < 5) {
			System.out.println("++반복문 : " + ++whileCnt + " 입니다.\t");
		}
		
		System.out.println("\n");
		int forCnt = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("++반복문 : " + ++forCnt + " 입니다.\t");
		}
		System.out.println();
		forCnt = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("반복문++ : " + forCnt++ + " 입니다.\t");
		}
		
	}

}
