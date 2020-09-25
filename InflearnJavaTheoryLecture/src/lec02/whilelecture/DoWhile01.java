package lec02.whilelecture;

/**
 * do while 문에 대한 실습입니다.
 */
public class DoWhile01 {

    public static void main(String[] args) {

        /**
         * 실습을 위한 단순한 do-while문을 하나 만들어 보겠습니다.
         */

        int intTest = 0;
        do {
            System.out.println("인덱스 : " + intTest);
            intTest++;
        } while (intTest < 5);

        /**
         * 값이 뜨지요?
         *
         * 다른 것도 테스트 해볼까요?
         */

        intTest = 0;

        do {
            System.out.println("인덱스 : " + intTest);
            intTest++;
        } while (intTest < 0);

        /**
         * 일단 한 번은 실행하는 것이 보이실 겁니다.
         * while 조건은 성립되지 않는 조건이예요.
         * intTest가 0으로 초기화가 되어 있습니다.
         * 근데 조건은 0보다 작을 동안이죠.
         * 이미 0인데 0보다 어떻게 작을 수가 있겠나요.
         * 성립하지 않는 조건인데 이미 한 번 수행을 해버린 것입니다.
         * 그러면 아예 직접적인 방법으로 실습을 해볼까요?
         */

        do {
            System.out.println("무조건 한 번은 실행합니다.");
        } while (false);

        /**
         * 조건을 아예 false로 줘버렸어요.
         * 근데 무조건 한 번은 실행하죠?
         * 이런 것이 do-while 문입니다.
         *
         * do-while 문에 대한 실습은 이 정도인 것 같아요.
         * do-while 문은 잘 쓰지 않습니다.
         * 거의 안 쓴다고 보면 맞겠지요.
         *
         * 저도 경력을 쌓아오면서 do-while문은 극단적으로 말해서 1000번 중 한 번 쓸까말까해요.
         * 진짜 많이 쓰는 반복문은 for문이고,
         * 가끔 쓰이는 반복문이 while 문입니다.
         *
         * 여기서 for문을 쓰느냐, while 문을 쓰느냐는 개발자의 선호도 차이일 수도 있어요.
         * for 문을 쓰면 더 좋은 것은 인덱스 관리가 더 편하다는 점입니다.
         *
         * 이 정도면 반복문에 대한 실습은 충분한 것 같습니다.
         *
         * 감사합니다.
         */

    }

}
