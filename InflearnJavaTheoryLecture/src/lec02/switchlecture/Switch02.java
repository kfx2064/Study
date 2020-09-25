package lec02.switchlecture;

import java.util.Scanner;

/**
 * 이번엔 두 번째 switch 강의입니다.
 */
public class Switch02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("값을 입력합니다 : ");
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

        /**
         * default 문이 없지요?
         * default가 없으면 기본으로 수행하는 로직이 없습니다.
         *
         * case별로 break도 존재하지 않지요?
         * 각 break가 존재하지 않음으로써 몇 가지 값은 중복으로 같은 비즈니스 로직을 처리합니다.
         *
         * 코드의 로직을 이런 식으로 구현 가능합니다.
         *
         * 여기까지가 또 다른 switch 문의 실습의 끝입니다.
         * switch 문은 이런 식으로 활용이 가능합니다.
         * 다른 활용은 스스로 생각해 보시면서 다양한 처리 방법을 수행해 보시는 것도 좋습니다.
         *
         * 감사합니다.
         *
         * 다음 강의에서 뵙겠습니다.
         */

    }

}
