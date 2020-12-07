package lec02.switchlecture;

import java.util.Scanner;

public class Switch02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력합니다. : ");
		String strGetScore = scanner.next();
		
		int intGetScore = Integer.parseInt(strGetScore);
		
		switch (intGetScore) {
			case 90 :
			case 80 :
			case 70 :
				System.out.println("고평가 대상입니다.");
				break;
			case 60 :
			case 50 :
				System.out.println("양호평가 대상입니다.");
				break;
			case 40 :
			case 30 :
			case 20 : 
			case 10 :
				System.out.println("저평가 대상입니다.");
				break;
		}
		
	}

}
