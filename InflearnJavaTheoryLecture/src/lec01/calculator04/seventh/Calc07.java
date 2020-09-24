package lec01.calculator04.seventh;

/**
 * 이번엔 연산자 우선 순위에 대한 실습을 할 것입니다.
 * 하지만 연산자 우선 순위의 이론을 다루는 실습을 하진 않을 것입니다.
 * 우선 순위를 가지면서 연산하는 방법에 대해 중점적으로 다뤄 드리겠습니다.
 * 제가 판단하기에는 그것이 더 유용할 거라고 생각하기 때문입니다.
 *
 * 그럼 강의를 따라와 주세요.
 */
public class Calc07 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        double calcData1 = (1.0 + 2.0) / 2.0;
        double calcData2 = 1.0 + (2.0 / 2.0);

        System.out.println("calcData1 : " + calcData1);
        System.out.println("calcData2 : " + calcData2);

        /**
         * 결과값이 확인되시나요?
         * 1.5와 2.0입니다.
         * 괄호로 묶어서 로직을 처리하는 것이지요.
         *
         * 괄호로 묶어서 우선 순위를 정해주는 것이 가장 좋습니다.
         * 다른 실습을 또 해볼까요?
         */

        calcData1 = 1 + 2 / 3 - 4 * 5;
        calcData2 = 1 + 2 / 3 - 4 * 5;
        double calcData3 = 1 + 2 / 3 - 4 * 5;

        System.out.println("calcData1 : " + calcData1);
        System.out.println("calcData2 : " + calcData2);
        System.out.println("calcData3 : " + calcData3);

        /**
         * 동일한 결과값이 뜨지요?
         * 계산 결과값이 다르게 뜨게 하려면 괄호로 묶으면 되겠지요?
         * 그럼 괄호로 묶는 계산을 진행해 보겠습니다.
         */

        calcData1 = (1 + 2) / (3 - 4) * 5;
        calcData2 = 1 + (2 / 3) - 4 * 5;
        calcData3 = 1 + 2 / ((3 - 4) * 5);

        System.out.println("괄호 묶고 calcData1 : " + calcData1);
        System.out.println("괄호 묶고 calcData2 : " + calcData2);
        System.out.println("괄호 묶고 calcData3 : " + calcData3);

        /**
         * 각각의 값이 다르게 뜨지요?
         * 이렇게 괄호를 묶는 방식을 활용하면 연산의 순서를 바꿀 수 있습니다.
         * 실제 계산 로직은 한 번의 변수에 복잡한 계산을 담아서 하지 않습니다.
         * 하나씩 쪼개지요.
         * 보여 드리겠습니다.
         */

        calcData1 = 1 + 2;
        calcData1 = calcData1 / 3;
        System.out.println("계산 calcData1 : " + calcData1);

        /**
         * 보이지요?
         * 저런 식으로 순차적으로 계산을 합니다.
         * 저런 식으로 계산식을 짜는 것을 추천 드립니다.
         * 아니면 다른 방식도 있습니다.
         * 무엇이냐 하면 가독성을 높이는 방식 말입니다.
         * 무엇이든 계산식을 짤 때는 가독성을 높이는 방식으로 짜는 것이 좋습니다.
         * 비단 계산식 뿐만 아니라
         * 코드를 짤 때는 가독성을 높이는 방향으로 짜는 것을 추천 드립니다.
         *
         * 그러면 이번 강의도 여기까지 진행하겠습니다.
         * 감사합니다.
         */

    }

}
