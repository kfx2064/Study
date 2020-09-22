package lec01.calculator04.first;

/**
 * 산술 연산자 클래스입니다.
 */
public class Calc01 {

    public static void main(String[] args) {

        byte sumByte1 = 2 + 2;
        short sumShort1 = 3 + 5;
        int sumInt1 = 1 + 2;
        float sumFloat1 = 1.23f + 2.345f;
        double sumDouble1 = 1.1 + 2.345;

        /**
         * 다양한 데이터 타입을 사용하여 더하기를 해보았습니다.
         * 출력해 볼까요?
         */
        System.out.println("sumByte1 : " + sumByte1);
        System.out.println("sumShort1 : " + sumShort1);
        System.out.println("sumInt1 : " + sumInt1);
        System.out.println("sumFloat1 : " + sumFloat1);
        System.out.println("sumDouble1 : " + sumDouble1);

        /**
         * 다양한 자료형으로, 자료형이 곧 데이터 타입입니다.
         * 자료형으로 더하기를 해보았습니다.
         * 앞으로는 단순한 자료형으로 계산을 해보도록 하겠습니다.
         */

        int minInt1 = 10 - 2;
        System.out.println("minInt1 " + minInt1);

        /**
         * 빼기가 정상적으로 출력되지요?
         *
         * 이번엔 곱하기를 해보겠습니다.
         */

        double mutDbl = 10.1 * 2;
        System.out.println("mutDbl : " + mutDbl);

        /**
         * 잘 출력되지요?
         * 이번엔 나누기입니다.
         */

        float divFlt1 = 10.0f / 3.0f;
        System.out.println("divFlt1 : " + divFlt1);

        /**
         * 출력되는 것을 확인해 보세요.
         *
         * 여기서 특이점이 있습니다.
         * 다시 실습을 따라와 주세요.
         */

        float divFlt2 = 10 / 3;
        System.out.println("divFlt2 : " + divFlt2);

        /**
         * 실수 값이 정확히 안 뜨죠?
         * 소수점 아래가 짤려서 나옵니다.
         * 소수점 나누기를 할 때는 소수점을 활용해서 하는 것이 좋습니다.
         *
         * 이제 마지막으로 나누고 남은 나머지를 출력하는 것을 해보겠습니다.
         */

        double restDbl = 10.0 % 3.0;
        System.out.println("restDbl : " + restDbl);
        /**
         * 10을 3으로 나누면 1이 남지요?
         * 10을 3으로 나누면 몫은 3이고 10 - 9 는 1이 되니
         * 나머지가 1이 되는 것입니다.
         *
         * 산술 연산자 실습은 이 정도로 해두는 것이 좋을 것 같습니다.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         */

    }

}
