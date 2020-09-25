package lec02.iflecture;

/**
 * 조건문 중 if 구문입니다.
 */
public class If01 {

    /**
     * 메인 메서드를 작성하겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 조건문 하나를 실습해 볼까요?
         */

        int fruitCase = 10;
        String caseOne = "구매합니다.";
        String caseTwo = "구매하지 않습니다.";

        if (fruitCase > 9) {
            System.out.println(caseTwo);
        } else {
            System.out.println(caseOne);
        }

        /**
         * 만약 과일상자가 9개 보다 많다면 구매하지 않고
         * 10개보다 작다면 구매한다는 로직을 짰습니다.
         *
         * int 값은 10이라고 자동으로 저장하구요.
         *
         * if 로직을 통해서 구매하는 경우, 구매하지 않는 경우를 수행하였습니다.
         *
         * 그리고 결과값은 구매하지 않는다고 뜨는 것이죠.
         *
         * if-else의 간단한 로직은 이러합니다.
         *
         * 가장 기본적인 구문이 if-else 구문인데
         * 이번엔 if 구문을 실습해 보겠습니다.
         */

        int cashAmount = 3000;
        if (cashAmount < 5000) {
            System.out.println("현금을 인출합니다.");
        }

        /**
         * 현금이 작으므로 현금을 인출한다는 로직을 수행합니다.
         * 그렇다면 다른 것을 실습해 볼까요?
         */

        cashAmount = 6000;
        if (cashAmount < 5000) {
            System.out.println("현금을 인출합니다.");
        }

        /**
         * 현금이 충분하므로 현금을 인출하지 않습니다.
         * if 문은 else에 대한 대비가 없기 때문에
         * else 구문을 수행하지 않습니다.
         *
         * if를 수행하지 않으면 아무 것도 수행하지 않는 것이지요.
         *
         * if에 대한 강의는 뒤의 강의에서도 좀 더 이어가겠습니다.
         *
         * 감사합니다.
         */

    }

}
