package lec02;

/**
 * 네 번째 강의
 * while
 */
public class WhileLoop04 {

    public static void main(String[] args) {
        /**
         * while문도 반복문입니다.
         *
         * while문은 바로 진입해 볼까요?
         */

        int whileCnt = 0;
        while (whileCnt < 10) {
            whileCnt++;
            System.out.println("whileCnt ::: " + whileCnt);
        }

        /**
         * while 문은 이런 식으로 짤 수 있습니다.
         * while 반복문을 이런 식으로 짤 수도 있고 다른 식으로도 짤 수가 있습니다.
         * while 반복문의 가장 큰 차이는 for 반복문과 다르다는 것입니다.
         * for 반복문은 조건들이 안에 걸려 있습니다.
         * while 반복문은 조건이 안에 걸려 있지 않습니다.
         * 안에 걸려 있다는 의미는 괄호 안에 걸려 있거나 걸려 있지 않다는 것입니다.
         * while문은 조건 없이 돌아갑니다.
         * 그렇기 때문에 특정 조건을 로직 중에 심어주고 break; 문을 쓰거나
         * 아니면 증감 연산자를 주고 while문을 돌려야 합니다.
         *
         * 다른 while문을 돌려볼까요?
         */

        whileCnt = 0;
        while (true) {
            whileCnt++;
            System.out.println("if whileCnt는 " + whileCnt);
            if (whileCnt == 10) {
                break;
            }
        }

        /**
         * 위와 같은 while문도 가능합니다.
         * while안에 true를 넣었죠?
         * 저것이 조건이 되는데 true를 넣게 되면 while문은 false가 나타날 때까지
         * 무한반복을 돌게 됩니다.
         * 근데 생각해 봅시다.
         * while (true) 이런 식으로 하게 되면,
         * 그냥 계속 무한 반복하겠죠?
         * 그래서 안에서 if 조건문을 통해 특정 조건에서 break;를 걸어주는 것입니다.
         * break;는 if, switch, for, while에서 다 사용 가능합니다.
         *
         * 만약 조건 안의 값이 10에 도달하면 break;가 걸리는 것입니다.
         *
         * 다른 것도 짜볼까요?
         */

        whileCnt = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        /**
         * 위의 문장은 continue 문장입니다.
         * continue는 계속 이어서 하라는 뜻이죠.
         * 특정 조건에서 continue를 만나면 더 이상 로직을 진행하지 않고 다시 첫 번째로 돌아갑니다.
         * for 문 반복문 내에서 if문을 통해 특정 조건을 만났을 때,
         * 해당 조건문 내에서 continue 문장을 만나고 다시 맨 위로 돌아갑니다.
         * 지금 예시는 반복문에서 3으로 나눴을 때 0으로 떨어지는 숫자면 continue를 하게 했죠.
         * 그럼으로써 3을 건너띄고 숫자들을 찍게 됩니다.
         *
         * 지금은 이렇게 간단한 로직만 알아두셔도 좋습니다.
         * 나중에 실무를 할 때면,
         * 다양한 업무 로직에 대해 고민하고,
         * 그런 업무 로직에서 continue 문이 필요할 때가 있습니다.
         *
         * 그럼 반복문 중 while 문은 여기서 마치겠습니다.
         *
         * 감사합니다.
         */
    }

}
