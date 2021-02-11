package lec04.OOP08;

public class FactorialTest {

    /**
     * 재귀함수는 함수 안에서 함수를 다시 부르는 것이다.
     * 이를 통해서 값을 계속 곱해 나갈 수 있다.
     * 이것 이외에도 재귀함수는
     * 재귀쿼리와 마찬가지로
     * 계층형 데이터를 만들어서 조회할 수도 있다.
     * 실습을 통해 보자.
     * @param one
     * @return
     */

    public static int methodFactorial(int one) {
        if (one < 0) {
            return -1;
        }
        if (one == 0 || one == 1) {
            return 1;
        }
        System.out.println("one : " + one);
        int returnValue = one * methodFactorial(one - 1);
        System.out.println(one + " * factorial(" + (one - 1) + ") = " + returnValue);
        return returnValue;
    }
    
    public static void main(String[] args) {
        int resultValue = methodFactorial(5);
        System.out.println("결과값 : " + resultValue);

        /**
         * 이것이 재귀 함수이다.
         */
    }

}
