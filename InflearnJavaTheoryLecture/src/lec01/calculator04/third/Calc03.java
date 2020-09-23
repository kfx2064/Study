package lec01.calculator04.third;

/**
 * 이번엔 또 다른 연산자를 실습해 보겠습니다.
 * 우선 클래스를 만들겠습니다.
 */
public class Calc03 {

    /**
     * 클래스가 만들어 졌으면 메인 메서드를 만들도록 하겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 메인 메서드 안에서 실습을 진행하도록 하죠.
         * 변수를 활용하도록 하겠습니다.
         */
        int var1 = 10;
        int sum1 = var1++;
        System.out.println("sum1 : " + sum1);

        /**
         * 아무 변화가 없네요?
         * 이론 상에서 증감연사자 중에 ++a와 a++를 확인하셨죠?
         * 그럼 앞에 붙는 것을 실습해 보겠습니다.
         */

        int var2 = 10;
        int sum2 = ++var2;
        System.out.println("sum2 : " + sum2);

        /**
         * 자 이번엔 증가된 값을 확인하실 수 있죠?
         * 증감 연산자는 저런 용도입니다.
         * --도 확인해 보고 다른 내용을 더 확인해 보겠습니다.
         */

        int var3 = 10;
        int min3 = var3--;

        int var4 = 10;
        int min4 = --var4;

    }

}
