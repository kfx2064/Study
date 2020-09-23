package lec01.calculator04.fifth;

/**
 * 이번엔 비교 연산자를 실습해 보겠습니다.
 */
public class Calc05 {

    /**
     * 메인메서드를 만들어 보겠습니다.
     */
    public static void main(String[] args) {

        int one = 10;
        int two = 5;

        boolean cmpOne = one > two;
        System.out.println("cmpOne : " + cmpOne);

        /**
         * 산수를 아신다면 아시리라 생각합니다.
         *
         * 별 다른 설명없이 다른 것도 실습해 보겠습니다.
         */

        cmpOne = one < two;
        System.out.println("cmpOne : " + cmpOne);

        /**
         * 또 다른 걸 실습해 볼까요?
         */

        cmpOne = one == two;
        System.out.println("cmpOne : " + cmpOne);

        /**
         * 다르니까 false가 뜨는군요.
         *
         * 또 다른 걸 실습해 보겠습니다.
         */

        cmpOne = one != two;
        System.out.println("cmpOne : " + cmpOne);

        /**
         * 다르니까 true가 뜨는군요.
         *
         * 비교 연산자 실습은 이 정도로 하겠습니다.
         *
         * 좀 더 다양한 코드를 짜보려면 조건문에 대한 이해가 있어야 하는데
         * 현재는 조건문을 배우지 않은 상태이므로 이 정도의 실습만 하도록 하겠습니다.
         *
         * 감사합니다.
         *
         * 다음 강의에서 뵙겠습니다.
         */

    }

}
