package lec02.switchlecture;

import java.util.Scanner;

/**
 * switch case 구문입니다.
 *
 * 실습을 진행하겠습니다.
 */
public class Switch01 {

    public static void main(String[] args) {

        /**
         * 이전 강의에서 배운 스캐너를 활용해서 진행하겠습니다.
         */

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

        /**
         * 비즈니스 로직을 이런 식으로 처리할 수 있습니다.
         * 통제구역들은 접근 권한이 있는 사람만 접근할 수 있습니다.
         * 빌딩의 기계실이라든가,
         * 아파트의 전산 장비가 위치한 시설이라든가,
         * 건물 전체가 통제구역이라서 보안등급을 가진 사람만 접근할 수 있는 시설도 존재합니다.
         *
         * 나중에 여러분들도 일하시게 되면,
         * 그런 곳에 접근 권한을 할당받으시는 경우가 생기실 겁니다.
         *
         * 그럴 때를 비유를 들어서 이런 비즈니스 로직을 처리하였습니다.
         *
         * switch 문은 이런 식으로 동작합니다.
         * 각각의 조건에 맞는 case를 동작시키지요.
         * default는 아무 것도 해당하지 않을 때 동작하는 구문입니다.
         * default는 선택이지요.
         * 하지만 case가 없으면 코드는 에러가 납니다.
         * 하나 이상의 case가 존재해야 합니다.
         *
         * 그럼 이번 케이스 시나리오는 여기서 마치겠습니다.
         *
         * 다음 강의로 찾아뵙겠습니다.
         *
         * 감사합니다.
         */

    }

}
