package lec01.calculator04.forth;

/**
 * 연산자 클래스입니다.
 *
 * 메인 메서드를 만들겠습니다.
 */
public class Calc04 {

    public static void main(String[] args) {

        /**
         * 메인 메서드입니다.
         * 여기서 안 배운 문법을 사용하겠습니다.
         * 반복문을 사용할 것인데 반복문에는 주목하지 말아주세요.
         *
         * 주목해야 할 부분은 증감 연산자입니다.
         * ++, -- 입니다.
         *
         * 따라서 코딩해 주세요.
         */

        int whileCnt = 0;
        while (whileCnt < 5) {
            System.out.print("반복문++ : " + whileCnt++ + " 입니다.\t");
        }
        System.out.println();
        whileCnt = 0;
        while (whileCnt < 5) {
            System.out.print("++반복문 : " + ++whileCnt + " 입니다.\t");
        }

        /**
         * 증감연산자에 대한 실습입니다.
         * 입문 강의를 보신 분들은 익숙한 코드입니다.
         * 반복문 학습 시에 보셨을 겁니다.
         * 이 코드는 이 강의를 먼저 보시는 분들을 위한 코드입니다.
         * ++variable과 variable++의 차이를 보여드리는 겁니다.
         *
         * 다른 코드도 짜볼까요?
         */
        System.out.println("\n");
        int forCnt = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("++반복문 : " + ++forCnt + " 입니다.\t");
        }
        System.out.println();
        forCnt = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("반복문++ : " + forCnt++ + " 입니다.\t");
        }

        /**
         * while문과 별반 다른 차이가 없죠?
         * 반복문에는 주목하지 말아주세요.
         * 아직 안 배우셨으니 모르는 건 당연한 겁니다.
         * 제가 이 로직을 굳이 한 이유는 증감연사자 중에 ++의 앞에 두느냐, 뒤에 두느냐의 차이를
         * 알려드리고자 위함입니다.
         *
         * 이번 실습은 이 정도로만 해두겠습니다.
         *
         * 감사합니다.
         */

    }

}
