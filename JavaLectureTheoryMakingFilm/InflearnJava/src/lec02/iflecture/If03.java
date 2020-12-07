package lec02.iflecture;

public class If03 {
	
	public static void main(String[] args) {
		
		//int workScore = 95;
		//int workScore = 80;
		int workScore = 75;
		//int relationScore = 95;
		//int relationScore = 90;
		int relationScore = 75;
		boolean thisYearPromotionTarget = true;
		
		int totalScore = (workScore + relationScore) / 2;
		System.out.println("총 평가점수 : " + totalScore);
		
		String employeeGrade = String.valueOf("S");
		String employeeSalaryGrade = String.valueOf("가");
		
		if (totalScore >= 90) {
			System.out.println("S등급 인재입니다.");
			employeeGrade = String.valueOf("S");
			employeeSalaryGrade = String.valueOf("가");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("진급 대상입니다.\n평가 결과 S급입니다.\n절대 진급 대상입니다.");
			} else {
				System.out.println("진급 대상이 아닙니다.\n평가 결과 S급입니다.\n연봉 인상률 '가'급입니다.");
			}
		} else if (totalScore >= 80) {
			System.out.println("A등급 인재입니다.");
			employeeGrade = String.valueOf("A");
			employeeSalaryGrade = String.valueOf("나");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("진급 대상입니다.\n평가 결과 A급입니다.\n우선 진급 대상입니다.");
			} else {
				System.out.println("진급 대상입니다.\n평가 결과 A급입니다.\n연봉 인상률 '나'급입니다.");
			}
		} else if (totalScore >= 70) {
			System.out.println("B등급 인재입니다.");
			employeeGrade = String.valueOf("B");
			employeeSalaryGrade = String.valueOf("다");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("진급 대상입니다.\n평가 결과 B급입니다.\n진급 대상입니다.");
			} else {
				System.out.println("진급 대상이 아닙니다.\n평가 결과 B급입니다.\n연봉 인상률 '다'급입니다.");
			}
		} else if (totalScore >= 60) {
			System.out.println("C등급 인재입니다.");
			employeeGrade = String.valueOf("C");
			employeeSalaryGrade = String.valueOf("라");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("진급 대상입니다.\n평가 결과 C급입니다.\n진급 고려 대상입니다.");
			} else {
				System.out.println("진급 대상이 아닙니다.\n평가 결과 C급입니다.\n연봉 인상률 '라'급입니다.");
			}
		} else {
			System.out.println("D등급 인재입니다.");
			employeeGrade = String.valueOf("D");
			employeeSalaryGrade = String.valueOf("마");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("진급 대상입니다.\n평가 결과 D급입니다.\n진급 유보 대상입니다.");
			} else {
				System.out.println("진급 대상이 아닙니다.\n평가 결과 D급입니다.\n연봉 인상률 '마'급입니다.");	
			}
		}
		
		if (employeeGrade.equals("S")) {
			System.out.println("[진급]을 실행했습니다. 특별 보상을 실시합니다.");
		} else if (employeeGrade.equals("A")) {
			System.out.println("[진급]을 실행했습니다. 추가 보상을 실시합니다.");
		} else if (employeeGrade.equals("B")) {
			System.out.println("[진급]을 실행 전 팀장 재평가를 수행합니다.");
		} else if (employeeGrade.equals("C")) {
			System.out.println("[진급]을 보류합니다.");
		} else if (employeeGrade.equals("D")) {
			System.out.println("[진급]을 실행하지 않습니다. [경고]를 실행합니다.");
		} else {
			System.out.println("[진급]을 실행하지 않습니다. [등급 외]입니다.");
		}
		
		if (employeeSalaryGrade.equals("가")) {
			System.out.println("연봉인상 [가]급을 수행합니다.");
		} else if (employeeSalaryGrade.equals("나")) {
			System.out.println("연봉인상 [나]급을 수행합니다.");
		} else if (employeeSalaryGrade.equals("다")) {
			System.out.println("연봉인상 [다]급을 수행합니다.");
		} else if (employeeSalaryGrade.equals("라")) {
			System.out.println("연봉인상 [라]급을 수행합니다.");
		} else if (employeeSalaryGrade.equals("마")) {
			System.out.println("연봉인상 [마]급을 수행합니다.");
		} else {
			System.out.println("연봉인상 [등급 외]급을 수행합니다.");
		}
		
	}

}
