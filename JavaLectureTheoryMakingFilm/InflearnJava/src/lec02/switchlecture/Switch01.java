package lec02.switchlecture;

import java.util.Scanner;

public class Switch01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("접근하려는 시설 보안 등급 : ");
		String strBuildingSecurityGrade = scanner.next();
		
		System.out.println("시설 접근 권한을 평가합니다.");
		
		switch (strBuildingSecurityGrade) {
			case "가" :
				System.out.println("가급입니다.\n보안 2등급 이상 소지자만 접근할 수 있습니다.");
				break;
			case "나" :
				System.out.println("나급입니다.\n보안 3등급 이상 소지자만 접근할 수 있습니다.");
				break;
			case "다" :
				System.out.println("다급입니다.\n대외비입니다. 직원만 접근할 수 있습니다.");
				break;
				default:
					System.out.println("급이 없습니다.\n등급 외입니다. 접근 제한이 없습니다.");
					break;
		}
		
	}

}
