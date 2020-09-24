package lec02.first;

/**
 * 조건문 강의입니다.
 *
 * 잘 따라와 주세요.
 */
public class If02 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 4가지 케이스를 만들어서 조건문을 수행합니다.
         */
        //int cashAmount = 10000;
        //int cashAmount = 7000;
        //int cashAmount = 3000;
        int cashAmount = 2000;
        int afterAmount = 0;
        String strMsg1 = "잔금이 3천원 미만입니다. 현금을 인출합니다.";
        String strMsg2 = "잔금이 5천원 초과입니다. 현재 상태를 유지합니다.";
        String strMsg3 = "잔금이 9천원 초과입니다. 초과금을 입금합니다.";

        if (cashAmount > 9000) {
            System.out.println(strMsg3);
            afterAmount = cashAmount - (cashAmount - 9000);
        } else if (cashAmount > 5000){
            System.out.println(strMsg2);
            afterAmount = cashAmount;
        } else if (cashAmount < 3000) {
            System.out.println(strMsg1);
            afterAmount = 9000;
        } else {
            afterAmount = cashAmount;
        }

        System.out.println("잔금입니다 : " + afterAmount);

        /**
         * 각각의 케이스에 걸릴 때 조건을 수행하지요.
         * 각 케이스에서 조건들이 수행되는 것을 확인하면 if-elseif-else 구문이
         * 실행되는 순서를 확인하실 수 있습니다.
         * if 구문은 만약에로 해당하는 조건이 참인지 거짓인지 확인합니다.
         * 그리고 else if에서 이전 조건에서 거짓일 경우 다시 조건을
         * 검증합니다.
         * 그리고 참이면 else if 구문 안의 로직을 수행하고
         * 거짓이면 그 다음으로 넘어갑니다.
         *
         * 그리고 else는 아무 것도 해당되지 않을 때 수행하는 구문입니다.
         *
         * 이것이 if- else if-else 구문입니다.
         *
         * 조건문의 여러 가지 경우의 수 중 하나입니다.
         *
         * 감사합니다.
         */

    }

}
