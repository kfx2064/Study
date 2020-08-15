package lec02;

/**
 * 두 번째
 * case문
 */
public class CaseLogic02 {

    public static void main(String[] args) {
        /**
         * switch 문이 있습니다.
         * switch 문은 각종 case를 통해 조건을 걸러줍니다.
         *
         * 아래 샘플 코드를 짜보겠습니다.
         */

        int paramA = 1;

        switch (paramA) {
            case 0 :
                System.out.println("0입니다.");
                break;
            case 1 :
                System.out.println("1입니다.");
                break;
            case 2 :
                System.out.println("2입니다.");
                break;
            case 3 :
                System.out.println("3입니다.");
                break;
            case 4 :
                System.out.println("4입니다.");
                break;
        }

        /**
         * 어려워 보이시죠?
         * 근데 가벼운 마음으로 보시면 이해하실 수 있습니다.
         * switch() 안에는 어떤 특정 값이 들어갑니다.
         * 그 뒤 case를 통해 switch 괄호 안에 들어가는 값을 비교합니다.
         * case를 통해서 각각의 값을 비교하는 것입니다.
         * 그렇게 하여 일치하는 case 문이 생기면 해당 안의 내용을 실행하는 것입니다.
         * 각각의 case 문 아래에는 break; 라는 문장이 있지요?
         * 이것은 해당 case의 내용을 실행하고 멈추라는 것입니다.
         *
         * 다른 내용의 코드를 짜볼까요?
         */

        paramA = 0;

        switch (paramA) {
            case 0 :
            case 1 :
                System.out.println("0과 1입니다.");
                break;
            case 2 :
            case 3 :
                System.out.println("2와 3입니다.");
                break;
            default:
                System.out.println("default입니다.");
                break;
        }

        /**
         * 위의 내용을 보시면 아실 수 있을 겁니다.
         * case 0 뒤에는 break; 가 없습니다.
         * break;가 없다는 것은 멈추지 않고 그 다음 case를 실행한다는 것입니다.
         * case 0과 case 1를 동시에 실행할 수도 있다는 의미가 됩니다.
         * 사실 이런 로직은 잘 쓰지 않습니다.
         * 위의 각 case마다 break를 거는 것을 사용하지요.
         * switch 문은 복잡한 조건문을 거는 경우는 거의 없습니다.
         * 그럴 경우엔 if문을 쓰지요.
         * 예를 들어보겠습니다.
         */

        int intCnt = 2;

        if (intCnt % 2 == 0) {
            if (intCnt == 2) {
                System.out.println("int자료가 2입니다.");
            } else {
                System.out.println("int자료가 2가 아닙니다.");
            }
        }

        /**
         * 위의 로직을 실행하면 조건문을 통해 알게 됩니다.
         * 중복 if문을 실행하게 되지요.
         * 중복 if문을 통해서 둘 중 하나를 실행하게 됩니다.
         * 즉 복잡한 조건문은 위와 같이 실행하게 됩니다.
         * switch 문을 복잡하게 사용하지 않지요.
         * if문을 통해 복잡하게 사용합니다.
         * 그래서 switch 문은 위와 같이 case마다 break를 거는 문장을 쓰는 것이 좋습니다.
         * 다른 예를 들어보겠습니다.
         */

        int intParamA = 9;

        switch (intParamA) {
            case 0 :
                System.out.println("intParamA는 0입니다.");
                break;
            case 1 :
                System.out.println("intParamA는 1입니다.");
                break;
            case 2 :
                System.out.println("intParamA는 2입니다.");
                break;
            case 3 :
                System.out.println("intParamA는 3입니다.");
                break;
            case 4 :
                System.out.println("intParamA는 4입니다.");
                break;
            case 5 :
                System.out.println("intParamA는 5입니다.");
                break;
            default:
                System.out.println("intParamA는 default입니다.");
                break;
        }

        /**
         * 무엇일까요?
         * default라는 차이가 있습니다.
         * 이것은 마치 if-else문과 같습니다.
         * 각각의 case 문을 비교해 봅니다.
         * 각자 비교해 봤더니 switch 괄호 안에 있는 값과 일치하는 것이 없습니다.
         * 그러면 마지막에 default 값을 실행하게 됩니다.
         * default, 기초적인, 기본적인, 기초의, 즉 그 영어 뜻 그대로의 내용입니다.
         * default는 아무 것도 조건문이 걸리는 것이 없으면 해당 내용을 실행한다는 것입니다.
         * default를 어떨 때 쓰면 좋은지 이해가 되시나요?
         * default를 붙이지 않으면 각각의 case에 해당하는 값이 없으면 아무 것도 실행하지 않습니다.
         * 하지만 default를 붙이면 각각의 case에 해당하는 값이 없으면 무조건 기본적인 값을 실행합니다.
         *
         * 이런 차이를 활용하여 조건문을 실행시켰을 때
         * 기본 값을 무조건 실행하려면 위와 같은 코드를 짜야 합니다.
         *
         * 여기까지 switch 문을 알아두시면 좋습니다.
         *
         * 감사합니다.
         */

    }

}
