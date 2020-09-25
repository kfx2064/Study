package lec02.iflecture;

/**
 * if 조건문 강의입니다.
 */
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
                System.out.println("진급 대상이 아닙니다.\n평가 결과 A급입니다.\n연봉 인상률 '나'급입니다.");
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

        /**
         * 저렇게 평가를 내릴 수 있습니다.
         * 실제 인사시스템, 보통 ERP에서 인사 모듈이지요.
         * 인사 모듈에서 저런 식으로 단순하게 평가하지 않습니다.
         * 강사도 ERP 인사를 개발한 경험이 있고,
         * 당시 해당 중견기업은 특정 기준으로 직을 나누고
         * 각 직별로 평가 기준이 다양하게 있었습니다.
         * 그리고 각 평가 기준별로, 기준 내에서 등급별 점수를 할당하고
         * 점수를 계산하여 그 사람의 성과를 평가했죠.
         *
         * 인사는 기업을 운영하는데 매우 중요한 요소입니다.
         * 인사의 공정함, 그리고 인사의 정확도는 해당 기업의 생존을 가른다는 말이 나올 정도죠.
         * 사실 모든 부서가 중요하긴 합니다.
         * 회계가 정확하지 않으면 기업이 쉽게 부실해지고,
         * 총무가 알뜰하지 않으면 기업의 비용이 증가하며,
         * 구매와 영업이 잘하지 않으면 기업의 이익이 감소하죠.
         * 모든 모듈들이 중요하고 모든 부서가 중요합니다.
         * 필요없는데 존재하는 경우는 드물어요.
         * 필요없는데 존재한다면 거긴 무슨 특별한 이유가 있는 겁니다.
         *
         * 잠시 곁가지 이야기를 했구요.
         * 이제 평가 내린 것을 조건문으로 실습해 보죠.
         */

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

        /**
         * 위의 각 변수를 바꿔가면서 실행해 볼까요?
         *
         * 조건문은 이렇게 비즈니스 로직을 처리하면서 수행할 수 있습니다.
         *
         * 그럼 이번 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

}
