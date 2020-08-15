package lec02;

/**
 * 첫 번째
 * 조건문
 */
public class IfLogic01 {

    public static void main(String[] args) {

        /**
         * 이제 조건문입니다.
         * 조건문에는 여러 가지의 종류가 있습니다.
         * 그 중 가장 많이 쓰이는 것이 if문입니다.
         * if문은 여러 가지의 종류가 있습니다.
         * 그리고 가장 많이 쓰이는 것은 if문으로 활용도가 다양하기 때문입니다.
         * if문과 case 문에 대해 알아보고, 반복문에 대해 알아본 다음,
         * 그 다음에는 if문과 case 문을 사용하여
         * 몇 가지 샘플 코드를 짜보겠습니다.
         *
         * 아래를 봐주세요.
         */

        if (true) {
            System.out.println("true입니다.");
        }

        if (false) {
            System.out.println("false입니다.");
        }

        /**
         * 위의 조건문을 실행해 보세요.
         * 무언가 다른 게 보이시죠?
         * true 조건문은 true입니다 라는 것이 출력됩니다.
         * false 조건문은 false입니다 라는 것이 출력되지 않습니다.
         *
         * 왜일까요?
         *
         * if (true) 일 때는 조건문이 참이기 때문에 중괄호 안의 로직이 실행되는 것입니다.
         * 근데 if (false) 일 때는 조건문이 참이 아니기 때문에 중괄호 안의 로직이 실행되지 않는 것입니다.
         *
         * if문의 용도가 바로 이런 것입니다.
         * if문을 통해서 중괄호 안의 로직을 실행하느냐 마느냐의 차이가 있는 것이지요.
         * 다른 예를 들어볼까요?
         */

        if (true) {
            System.out.println("ifelse true입니다.");
        } else if (false) {
            System.out.println("ifelse false입니다.");
        }

        /**
         * 뭔가 차이가 잘 모르시겠죠?
         * 다르게 짜겠습니다.
         */

        int paramA = 1;

        if (paramA == 2) {
            System.out.println("첫 번째 if입니다.");
        } else if (paramA == 1) {
            System.out.println("두 번째 else입니다.");
        }

        /**
         * 위의 코드를 짜보시니 확실히 느낌이 오시나요?
         * == 는 두 개의 값이 같은지 비교하는 연산자입니다.
         * paramA는 1이죠.
         * 두 개의 if문 중 어디가 1인지 비교하죠?
         * else if의 문이죠.
         * 저것이 바로 if-else 문입니다.
         * 만약 1의 조건이 참이라면?
         * 참이 아니라면 2의 조건인 else 문을 실행하고
         * 참이라면?
         * 둘 다 참이 아니라면 실행하지 않습니다.
         * if의 조건이 먼저 참이라면 해당 조건의 내용을 먼저 실행합니다.
         * else도 참이더라도 if를 실행하지 않습니다.
         * 한 번 해볼까요?
         */

        if (paramA == 1) {
            System.out.println("첫 번째 참입니다.");
        } else if (paramA == 1) {
            System.out.println("두 번째 참입니다.");
        }

        /**
         * 첫 번째만 실행되지요?
         * 이것이 if-else문의 특징입니다.
         * 이제 if-else if-else도 있습니다.
         */

        if (paramA == 2) {
            System.out.println("paramA는 2");
        } else if (paramA == 3) {
            System.out.println("paramA는 3");
        } else {
            System.out.println("paramA는 1");
        }

        /**
         * 위와 같은 형태도 있습니다.
         * if와 else if를 다 통과하고 난 뒤에
         * 마지막에 else문을 통해 실행하는 것이지요.
         * 저것은 if문의 조건들을 모두 비교해 보고 실행되지 않으면
         * else 문에서 마지막 조건을 실행하는 것입니다.
         * 다른 예를 보여드리겠습니다.
         */

        if (paramA == 2) {
            System.out.println("paramA는 2입니다.");
        } else {
            System.out.println("paramA는 else문입니다.");
        }

        /**
         * 무슨 내용인지 이해가 되시나요?
         *
         * 아래 더 코딩하겠습니다.
         */

        if (paramA == 2) {
            System.out.println("아무 것도... paramA는 2입니다.");
        } else if (paramA == 3) {
            System.out.println("아무 것도... paramA는 3입니다.");
        }

        /**
         * if-else문과의 차이가 느껴지시나요?
         * if, else if의 경우 if가 들어갑니다.
         * 만약에 어떤어떤 조건과 비교했을 때 참이라면 안의 로직을 실행합니다. 이런 것입니다.
         * 근데 두 가지의 어떤어떤 조건과 비교했을 때를 보니 참이 둘 다 아니죠?
         * 그럼 아무 것도 실행되지 않습니다.
         * 하지만 if-else는 다릅니다.
         * if문의 조건을 비교해 보고, if문의 조건이 되지 않는다면
         * else 문의 것을 실행합니다.
         *
         * 즉, if-else는 if를 비교해 보고 아니면 무조건 else를 실행합니다.
         * 하지만 if-else if를 쓴다면 다릅니다.
         * else if를 쓰게 되면 둘 다 if가 들어가므로 둘 다 조건이 맞지 않는다면 아무 것도 실행하지 않습니다.
         * else 는 위의 조건들이 실행되고 참이 아닐 경우 무조건 실행하게 됩니다.
         *
         * if-else를 쓸 때는 둘 중 하나는 무조건 실행해야 할 때 쓰는 것이 좋습니다.
         * 정말 많이 쓰이죠.
         * if-else if는 특정 조건의 값들만 실행하고 아닌 것들은 아예 무시할 때 짜는 형태입니다.
         * 이것도 자주 쓰이죠.
         *
         * if문은 이 정도로 알아두는 것이 좋습니다.
         *
         * 감사합니다.
         */

    }

}
