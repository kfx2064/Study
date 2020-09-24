package lec01.calculator04.sixth;

/**
 * 연산자 강의입니다.
 *
 * 이번엔 논리 연산자입니다.
 */
public class Calc06 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 먼저 값을 저장하는 변수를 만들겠습니다.
         */
        int first = 10;
        int second = 50;

        /**
         * OR 조건에 대해 비교해 보겠습니다.
         */
        boolean cmpOrCondition = (first == 10) || (second == 50);
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        /**
         * 둘 다 true 조건이므로 당연히 true가 뜨겠지요?
         *
         * 이번엔 하나만 true인 것으로 실습해 보겠습니다.
         */

        cmpOrCondition = (first == 20) || (second == 50);
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        /**
         * 하나만 true여도 true가 뜨지요?
         * or 조건이므로 둘 중 하나만 true여도 true가 뜹니다.
         * 그러면 false가 뜨도록 해볼까요?
         */

        cmpOrCondition = (first == 20) || (second == 60);
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        /**
         * false가 뜨지요?
         * 두 조건이 false이므로 아무 것도 true가 아니니까 or 조건에서 false가 뜨는 겁니다.
         *
         * 이렇게 or 조건을 확인해 볼 수 있습니다.
         * 그러면 다음 실습을 해보겠습니다.
         */

        first = 10;
        second = 20;

        cmpOrCondition = ((first > 9) && (second < 21));
        /**
         * first와 second의 값은 각각 10과 20이지요?
         * first가 9보다 크다면 10이므로 true이고,
         * second가 21보다 작다이면 true이므로
         * true가 리턴될 것입니다.
         *
         * 왜냐면 둘 다 true일 경우 true가 리턴되는 것을 and 조건이라 하니까요.
         *
         * 결과값을 확인해 보겠습니다.
         */
        System.out.println("and조건 cmpOrCondition : " + cmpOrCondition);

        /**
         * true가 뜨지요?
         * 이번엔 false가 뜨도록 해보겠습니다.
         */

        first = 1;
        second = 5;

        /**
         * 변수에 값을 새롭게 셋팅하구요.
         */

        cmpOrCondition = (first < 1) && (second > 6);
        System.out.println("and cmpOrCondition : " + cmpOrCondition);

        /**
         * false가 뜨지요?
         * 둘 다 false 조건이므로 false가 뜨는 겁니다.
         * 그러면 이번에는 하나만 false가 뜨도록 해볼까요?
         */

        cmpOrCondition = (first > 2) && (second < 6);
        System.out.println("and cmpOrCondition : " + cmpOrCondition);

        /**
         * first는 1이므로 2보다 크다 조건은 false가 뜰 겁니다.
         * second는 6보다 작다이므로 second가 5이니까 true가 뜰 거구요.
         *
         * and 조건으로 비교하면 둘 다 true이여야 하므로,
         * 하나만 true이면 false가 뜨는 것이 정상입니다.
         *
         * 이것이 and 조건입니다.
         *
         * 마지막으로 ~이 아니다의 조건을 실습해 보겠습니다.
         */

        first = 2;
        second = 4;

        cmpOrCondition = first != 2;
        System.out.println("cmpOrCondition 2가 아니다 : " + cmpOrCondition);
        cmpOrCondition = second != 1;
        System.out.println("cmpOrCondition 1이 아니다 : " + cmpOrCondition);

        /**
         * first는 2가 아니다는 당연히 false가 뜨겠죠? 왜냐면 first는 2이므로 2가 아니라 하면 틀린 결과값이 되겠죠.
         * second는 4인데 1이 아니다, 하면 true가 뜨겠죠? 왜냐면 당연히 1이 아니고 4이므로 그런 것입니다.
         *
         * 이것들이 논리 연산자입니다.
         *
         * 논리 연산자에 대한 실습을 하였지만,
         * 논리 연산자를 정말 많이 쓰이는 곳은 조건문에서 많이 쓰입니다.
         * 조건문에서 특정 조건을 만족할 때 조건문이 실행됩니다.
         * 그렇기 때문에 if, switch 문 등을 실습할 때
         * 조건문이 제대로 실습됩니다.
         *
         * 나중에 조건문을 배우시고 나시면 다양한 조건문들을 실습해 보시기 바랍니다.
         *
         * 그러면 이번 강의는 여기서 마치겠습니다.
         * 감사합니다.
         */

    }

}
