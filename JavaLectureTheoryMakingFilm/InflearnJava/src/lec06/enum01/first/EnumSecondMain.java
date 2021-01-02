package lec06.enum01.first;

import java.util.Scanner;

public class EnumSecondMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("값을 입력하세요.   ");
			int scIn = scanner.nextInt();
			
			if (scIn == EnumCRUD.CREATE.getIntValue()) {
				System.out.println("저장입니다.");
			} else if (scIn == EnumCRUD.READ.getIntValue()) {
				System.out.println("읽기입니다.");
			} else if (scIn == EnumCRUD.UPDATE.getIntValue()) {
				System.out.println("수정입니다.");
			} else if (scIn == EnumCRUD.DELETE.getIntValue()) {
				System.out.println("삭제입니다.");
			} else {
				break;
			}
		}
		
	}

}
