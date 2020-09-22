package lec01.calculator04.second;

/**
 * 또 다른 형태의 산술 연산자를 실습해 보겠습니다.
 */
public class Calc02 {

    public static void main(String[] args) {

        /**
         * 또 다른 형태의 연산자를 실습해 보겠습니다.
         * 코드를 잘 따라서 실습해 주세요.
         */
        int intVar1 = 10;
        int intVar2 = 2;
        intVar1 += intVar2;

        System.out.println("intVar1 : " + intVar1);
        /**
         * 더하기 연산자를 축약해 놓은 것입니다. 결과값을 확인하셨나요?
         * 그럼 저것을 풀어쓰면 어떤 형태인지 보여드리겠습니다.
         */

        intVar1 = 10;
        intVar2 = 2;
        intVar1 = intVar1 + intVar2;

        System.out.println("intVar1 : " + intVar1);

        /**
         * 풀어 쓰면 이런 형태가 되는 것입니다.
         * 두 가지 경우의 수의 결과값은 동일합니다.
         *
         * 그러면 다른 케이스들을 실습해 볼까요?
         */

        intVar1 = 10;
        intVar2 = 2;
        intVar1 -= intVar2;
        System.out.println("빼기 : " + intVar1);

        /**
         * 빼기를 축약한 것입니다.
         * 굳이 풀어쓰는 것은 의미가 없겠지요?
         * 이번엔 곱하기를 해보겠습니다.
         */

        intVar1 = 10;
        intVar2 = 2;
        intVar1 *= intVar2;
        System.out.println("곱하기 : " + intVar1);

        /**
         * 곱하기는 풀어쓰기를 해보겠습니다.
         */

        intVar1 = 10;
        intVar2 = 2;
        intVar1 = intVar1 * intVar2;
        System.out.println("곱하기 풀어쓰기 : " + intVar1);

        /**
         * 곱하기는 위와 같이 풀어쓰기를 합니다.
         * 곱하기는 그냥 풀어쓰기를 해보고 싶었습니다.
         * 보시고 확인하는 용도로 생각하시길 바랍니다.
         *
         * 이번엔 나누고 남은 나머지를 확인하겠습니다.
         */

        intVar1 = 10;
        intVar2 = 3;
        intVar1 %= intVar2;
        System.out.println("나누고 남은 나머지 : " + intVar1);

        /**
         * 이제 다 실습해 본 것 같습니다.
         * 축약형은 사람에 따라 선호도가 다릅니다.
         * 축약형을 주로 쓰이는 것은 반복문 중 for문에서 자주  쓰입니다.
         * 그 외에는 잘 안 쓰기도 하는데,
         * 이유는 가독성이 좋은 편은 아니기 때문입니다.
         *
         * 깨끗한 코드를 짜는 기법 중 하나는
         * 남이 코드를 읽었을 때 쉽게 읽도록 해주는 것입니다.
         *
         * 그럼 이번 강의는 여기서 마치겠습니다.
         * 감사합니다.
         */

    }

}
