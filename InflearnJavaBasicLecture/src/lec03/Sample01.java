package lec03;

/**
 * 첫 번째
 * 샘플
 */
public class Sample01 {

    public static void main(String[] args) {
        /**
         * 여기서는 몇 가지 샘플 코드를 짜보겠습니다.
         * 샘플 코드들을 짜는 이유는 여태까지 배운 이론적인 지식들과
         * 간단한 코드들을 활용하여 몇 가지 콘솔에 나오는 것들을 짜보려 합니다.
         * 활용 예들을 알아보는 것이지요.
         *
         * 첫 번째입니다.
         */

        for (int x = 2; x < 10; x++) {
            for (int y = 1; y < 10; y++){
                System.out.println(x + " * " + y + " = " + (x * y));
            }
        }

        /**
         * 구구단입니다.
         * 제가 학생이던 시절에 과제로도 많이 나오곤 했던 예제이죠.
         * 그때는 왜 이걸 만들라고 했을까, 궁금했을 때가 있습니다.
         * 나중에 실무를 하다보니 느낀 것이 있습니다.
         * 복잡한 업무 로직이나 데이터 처리를 할 때는
         * 이중 반복문을 사용할 때가 종종 있습니다.
         * 그때 이중 반복문을 for 문을 이용해서 가다듬으면,
         * 좋은 데이터 처리가 가능합니다.
         * 근데 이중 for문의 작동 방식을 이해하지 못한다면,
         * 문제가 발생합니다.
         * 왜냐면 이중 for문의 작동 방식을 모를 때는
         * 이중 for문 안에서 데이터 처리를 어떤 방식으로 해야 하는지 모르는 경우가 생기기 때문입니다.
         *
         * 위의 이중 for문을 알려 드리겠습니다.
         *
         * 이중 for 문은 바깥쪽 for문이 먼저 한 번 작동합니다.
         * 그리고 안쪽 for문이 작동하게 되죠.
         * 그때 바깥쪽 for문이 한 번 작동하고 안쪽 for문은 반복되는 횟수만큼 작동하게 됩니다.
         * 이해가 되시나요?
         * 바깥쪽 for 문이 2부터 9까지이고
         * 안쪽 for 문이 1부터 9까지라고 합시다.
         * 바깥쪽 for 문이 2를 시작합니다.
         * 그 다음 줄에 안쪽 for문이 존재하죠.
         * 안쪽 for 문은 1부터 9까지입니다.
         * 바깥쪽 for문은 2인 상태에서 멈춰서
         * 안쪽 for 문을 1부터 9까지 작동하게 되는 것입니다.
         * 그러고 안쪽 for문이 9까지 작동하게 되면
         * 다시 바깥쪽 for문으로 돌아가서 2에서 3으로 증가된 숫자가 되고
         * 3일 때의 반복문이 작동하면서 다시 안쪽 for문으로 들어옵니다.
         * 안쪽 for문에서는 다시 1부터 9까지 증가하죠.
         * 바깥쪽 for문이 3인 상태에서 안쪽 for문이 1부터 9까지인 것이 됩니다.
         * 그러므로 자연스럽게 구구단이 2단부터 9단까지 찍히게 되는 것입니다.
         */

        for (int i = 2; i < 10; i++) {
            System.out.println("i : " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        /**
         * 위와 같은 코드로 짜보면 알아보실 수 있습니다.
         * i를 일부러 찍었죠.
         * i에서 한 번씩 멈추고 다시 안쪽 for문의 j가 반복되는 것을 확인하실 수 있습니다.
         * 이것을 보시면 좀 더 이해가 되실 겁니다.
         * 이 정도 설명이면 만족스러우실 것이라 생각합니다.
         *
         * 다음 코드를 짜보겠습니다.
         */

        /**
         * Math.random이라는 함수가 있습니다.
         *
         * 아래의 코드를 봐주세요.
         */

        for (int i = 0; i < 10; i++) {
            double random = Math.random();
            System.out.println("random ::: " + random);
        }

        /**
         * Math.random은 위와 같은 실수를 찍어줍니다.
         * double 형태이죠.
         *
         * 이것을 아래와 같은 형태로 짜주면 int형 값을 0부터 9까지의
         * int형 값을 얻을 수 있습니다.
         */

        for(int i = 0; i < 5; i++) {
            int intMathRandom = (int) (Math.random() * 10);
            System.out.println(i + " : intMathRandom ::: " + intMathRandom);
        }

        /**
         * 위의 코드는 0부터 9까지의 랜덤한 값을 생성하는 것입니다.
         * 0부터 4까지의 값을 출력한 것은 랜덤한 값을 확인하기 위함입니다.
         * 자 아래에서 다른 코드를 짜보겠습니다.
         */

        int getMathRandom = (int) (Math.random() * 10);

        System.out.println("getMathRandom ::: " + getMathRandom);

        // 만약 랜덤값이 짝수이면
        if (getMathRandom % 2 == 0) {
            System.out.println("랜덤값은 짝수입니다.");

            // 랜덤값은 4로 나누어서 0으로 떨어집니다.
            if (getMathRandom % 4 == 0) {
                System.out.println("4로 나누어서 0으로 떨어집니다.");
                // 랜덤값은 4로 나누어서 0으로 떨어지지 않습니다.
            } else {
                System.out.println("4로 나누어서 0으로 떨어지지 않습니다.");
            }

            // 만약 랜덤값이 홀수이면
        } else {
            System.out.println("랜덤값은 홀수입니다.");

            // 랜덤값으로 3으로 나누어서 0으로 떨어집니다.
            if (getMathRandom % 3 == 0) {
                System.out.println("3으로 나누어서 0으로 떨어집니다.");
                // 랜덤값으로 3으로 나누어서 0으로 떨어지지 않습니다.
            } else {
                System.out.println("3으로 나누어서 0으로 떨어지지 않습니다.");
            }
        }

        /**
         * 위와 같은 코드를 짤 수 있습니다.
         * 조금 단순하죠.
         * 하지만 실무에서는 더 다양한 업무 로직을 반영하여 저런 이중 if문 구조로 로직을 짤 수 있습니다.
         * 저것은 일종의 예를 들어드린 것입니다.
         * 이중 if문 구조를 짜는 것은 사실 중요합니다.
         * 왜냐면 실무 업무 로직을 처리하다 보면
         * 이중 if문 구조로 짜야하는 경우가 많습니다.
         * 왜냐면 실무에서 사용하는 것들은 데이터 처리가 복잡한 경우가 많습니다.
         * 특히 기업의 매출액 단위가 높으면 높을수록 실무의 데이터 처리는 점점 더 복잡해 지는 경향이 있습니다.
         * 그 외에도 프로그램의 특성에 따라 데이터 처리가 복잡해 지는 경우가 있습니다.
         * 그럴 때는 이중 if문이 유효하게 작동하게 됩니다.
         * 다른 내용들을 또 짜보겠습니다.
         */

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ::: 현재 반복문은 짝수입니다.");
            } else {
                System.out.println(i + " ::: 현재 반복문은 홀수입니다.");
            }
        }

        /**
         * 위와 같은 로직을 짤 수도 있습니다.
         * for문 안에 if문이 들어가서 반복문이 작동하면서
         * if문이 각각의 경우에 작동하게 됩니다.
         * 이것도 하나의 예시입니다.
         * 제가 실무 이야기를 많이 하는데,
         * 사실 실무는 겪으면 겪을수록 실력이 늘어나게 됩니다.
         * 지금 조급하게 복잡한 로직을 짜려고 하지 않으셔도 됩니다
         *
         * 알고리즘 수준의 설명은 나중에 따로 알고리즘으로 공부하시면 좋습니다.
         * 특히 자료구조를 활용한 알고리즘을 짜시면 매우 좋습니다.
         * 자료구조를 통하여 효과적인 자료의 구조를 잡아주고,
         * 그것을 활용하여 자료들을 효과적인 알고리즘을 통해 처리하면
         * 멋진 결과값을 낼 수 있습니다.
         */

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 2) {
                System.out.println(i + " ::: 나머지는 2입니다.");
            } else if (i % 3 == 1) {
                System.out.println(i + " ::: 나머지는 1입니다.");
            } else if (i % 3 == 0) {
                System.out.println(i + " ::: 나머지는 0입니다.");
            }
        }

        /**
         * 위의 로직은 3으로 나누었을 때 나머지가 0, 1, 2인 것을 활용한 것입니다.
         * 이를 통해서 세 가지 경우의 수를 만들었습니다.
         * 그리고 그 안에서 if-else if-else를 만들었습니다.
         * 이런 샘플 코드들은 단순해 보일 수 있지만,
         * 이런 식으로 짤 수 있다는 것을 알기만 해도 큰 도움이 됩니다.
         * 코딩의 실력이 가장 빠르게 늘어나는 순간은
         * 자신보다 코드를 잘 짜는 이의 코드를 봤을 때입니다.
         * 그래서 흔히들 오픈소스를 보면 좋다, 라고 하는 것은
         * 오픈소스들 중 유명한 소스는 실력이 좋은 프로그래머들이 모여서 짭니다.
         * 그리고 해당 오픈소스에 코드가 반영되려면 실력 좋은 프로그래머들이
         * 인정해 준 코드만 오픈소스에 반영이 됩니다.
         * 그러므로 그런 오픈소스에 자신이 만든 코드가 일부 반영이 됐다는 것만 해도
         * 인정을 받는 것이 됩니다.
         * 그리고 그런 오픈소스만 봐도 실력이 급격하게 느는 계기가 됩니다.
         * 그 오픈소스에서는 추상화, 구체화, 객체지향 등의 개념들이
         * 녹아있기 때문입니다.
         *
         */

        StringBuilder sbPlus = new StringBuilder("");
        String[] arrStr = new String[]{"가", "나", "다", "라", "마", "바", "사", "아", "자", "차"};

        for (int i = 0; i < 10; i++) {
            int mathRandom = (int) (Math.random() * 10);
            System.out.println("랜덤하게 값을 출력합니다. ::: " + arrStr[mathRandom]);
        }

        /**
         * 위와 같이 랜덤하게 배열에서 한글을 뽑아내어 출력할 수 있습니다.
         * 간단한 알고리즘이기도 하지면 저런 식으로도 응용이 가능하다는 예를 들 수가 있습니다.
         * 샘플 코드는 이정도로 짜겠습니다.
         *
         * 이제 다음 강의로 넘어가겠습니다.
         */

    }

}
