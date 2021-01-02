package lec06.enum01.second;

import java.util.Scanner;

public class EnumDayMain {
	
	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("요일을 입력하세요.   ");
			
			Scanner scanner = new Scanner(System.in);
			String strNext = scanner.next();
			
			if (strNext.equals(EnumDay.MON.strName)) {
				System.out.println("월요일입니다.");
			} else if (strNext.equals(EnumDay.TUE.strName)) {
				System.out.println("화요일입니다.");
			} else if (strNext.equals(EnumDay.WED.strName)) {
				System.out.println("수요일입니다.");
			} else if (strNext.equals(EnumDay.THU.strName)) {
				System.out.println("목요일입니다.");
			} else if (strNext.equals(EnumDay.FRI.strName)) {
				System.out.println("금요일입니다.");
			} else if (strNext.equals(EnumDay.SAT.strName)) {
				System.out.println("토요일입니다.");
			} else if (strNext.equals(EnumDay.SUN.strName)) {
				System.out.println("일요일입니다.");
			} else {
				break;
			}
			
		}
		
	}

}
