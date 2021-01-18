package lec14.math02;

public class Math01 {

    public static void main(String[] args) {

        /**
         * Math에 대해 여러가지 사용법을 알아볼까요?
         *
         * 시작하겠습니다.
         */

        double random = Math.random();
        System.out.println(random);

        /**
         * 가장 기본적인 사용법입니다.
         */

        System.out.println("===================================");

        int random1 = (int) Math.random();
        System.out.println(random1);

        /**
         * int로 변환하는 것을 확인하실 수 있습니다.
         * int 값으로 리턴되지만 여러번 실행해도 0이 뜹니다.
         * 올바른 값이 뜨도록 해볼까요?
         */

        System.out.println("===================================");

        for (int i = 0; i < 10; i++) {
            int intResult = (int) (Math.random() * 10);
            System.out.println(i + " === " + intResult);
        }

        /**
         * 여러번 실행되면 값이 뜨는 것들을 확인하실 수 있습니다.
         * 곱하기 10을 하면 0과 9 사이의 값들이 뜨는 것을 확인하실 수 있죠.
         * 다른 방법도 있습니다.
         */

        System.out.println("===================================");

        for (int i = 0; i < 20; i++) {
            int intResult = (int) (Math.random() * 10 + 1);
            System.out.print(intResult + "  ||  ");
        }
        System.out.println();

        /**
         * 1과 10 사이의 랜덤한 값을 짤 때는 이런 식으로 할 수 있습니다.
         * 랜덤의 여러 가지 활용법이지요.
         *
         * abs라는 것이 있습니다.
         * 음수면 절대값을 리턴하고 양수이면 양수 값 그대로를 리턴합니다.
         * 한 번 해볼까요?
         */

        System.out.println("===================================");

        int abs1 = Math.abs(-1);
        int abs2 = Math.abs(1);
        double abs3 = Math.abs(10.1);
        double abs4 = Math.abs(-10.1);

        System.out.println("abs1 : " + abs1);
        System.out.println("abs2 : " + abs2);
        System.out.println("abs3 : " + abs3);
        System.out.println("abs4 : " + abs4);

        /**
         * 음수가 양수로 잘 전환되는 것을 확인하실 수 있죠?
         * abs는 이런 식으로 활용이 가능합니다.
         *
         * 다른 것도 살펴보겠습니다.
         *
         * 이번엔 ceil입니다.
         */

        System.out.println("===================================");

        double ceil1 = Math.ceil(10.5);
        double ceil2 = Math.ceil(0.00001);
        double ceil3 = Math.ceil(20.0);
        double ceil4 = Math.ceil(20.01);

        System.out.println("ceil1 : " + ceil1);
        System.out.println("ceil2 : " + ceil2);
        System.out.println("ceil3 : " + ceil3);
        System.out.println("ceil4 : " + ceil4);

        /**
         * 무조건 올림입니다.
         * 이를 통해 소수점 값을 올림하여 계산합니다.
         * 수학에서의 소수점 올림과 같습니다.
         * 소수점 아래에 무조건 값이 있으면 올림을 하는 것입니다.
         *
         * 이번엔 floor입니다.
         */

        System.out.println("===================================");

        double floor1 = Math.floor(10.5);
        double floor2 = Math.floor(10.0);
        double floor3 = Math.floor(0.0003);
        double floor4 = Math.floor(20.0);
        double floor5 = Math.floor(20.001);
        System.out.println("floor1 : " + floor1);
        System.out.println("floor2 : " + floor2);
        System.out.println("floor3 : " + floor3);
        System.out.println("floor4 : " + floor4);
        System.out.println("floor5 : " + floor5);

        /**
         * floor는 소수점 아래를 무조건 버립니다.
         * floor를 통해서 정수값만 구할 수 있습니다.
         */

        int intFloor1 = (int) floor1;
        int intFloor2 = (int) floor2;
        int intFloor3 = (int) floor3;
        int intFloor4 = (int) floor4;
        int intFloor5 = (int) floor5;
        System.out.println("intFloor1 : " + intFloor1);
        System.out.println("intFloor2 : " + intFloor2);
        System.out.println("intFloor3 : " + intFloor3);
        System.out.println("intFloor4 : " + intFloor4);
        System.out.println("intFloor5 : " + intFloor5);

        /**
         * 이런 식으로 int값만 구할 수도 있죠.
         * 활용법을 하나 알려드렸습니다.
         *
         * 이번엔 round에 대해 알아보겠습니다.
         */

        long round1 = Math.round(20.5);
        long round2 = Math.round(20.1);
        long round3 = Math.round(20.7);
        System.out.println("round1 : " + round1);
        System.out.println("round2 : " + round2);
        System.out.println("round3 : " + round3);

        /**
         * 반올림 기법이지요.
         * 소수점 첫째 자리에서 반올림한 결과를 리턴합니다.
         * 수학에서의 반올림을 생각하시면 됩니다.
         *
         * 이번엔 max입니다.
         */

        System.out.println("===================================");

        int max1 = Math.max(10, 2);
        double max2 = Math.max(10.1, 20.1);

        System.out.println("max1 : " + max1);
        System.out.println("max2 : " + max2);

        /**
         * 괄호 안의 두 개의 수를 비교합니다.
         * 그렇게 하여 큰 값을 리턴합니다.
         * 리턴 타입은 int와 double이 일반적입니다.
         * Math를 통해서 값 비교를 사용하는 경우는 드문 편입니다.
         * 주로 꺽쇠 기호를 사용하여 비교합니다.
         *
         * 이번엔 min을 확인해 보겠습니다.
         */

        System.out.println("===================================");

        int min1 = Math.min(10, 2);
        double min2 = Math.min(10.5, 2.5);

        System.out.println("min1 : " + min1);
        System.out.println("min2 : " + min2);

        /**
         * 이번엔 최소값을 구하는 로직입니다.
         * min을 통해 두 개의 값을 비교하여 최소값을 구할 수 있죠.
         * 마찬가지로 min 함수보다는 꺽쇠를 더 자주 사용하는 편입니다.
         *
         * 이번엔 pow, 제곱 연산입니다.
         */

        System.out.println("===================================");

        double pow1 = Math.pow(2, 3);
        double pow2 = Math.pow(2.1, 3.2);

        System.out.println("pow1 : " + pow1);
        System.out.println("pow2 : " + pow2);

        /**
         * 제곱 연산을 할 수 있습니다.
         * 수학에서의 제곱 연산을 생각하시면 됩니다.
         * 리턴 값은 double로 나옵니다.
         *
         * 이번엔 제곱근입니다.
         */

        System.out.println("===================================");

        double sqrt1 = Math.sqrt(9);
        double sqrt2 = Math.sqrt(3);

        System.out.println("sqrt1 : " + sqrt1);
        System.out.println("sqrt2 : " + sqrt2);

        /**
         * 9와 3의 제곱근입니다.
         * 마찬가지로 수학에서 제곱근을 구하는 공식과 같습니다.
         * 나중에 제곱근 값을 구하셔야 할 때는
         * sqrt를 사용하시길 바랍니다.
         *
         * 그럼 다음 값을 계산하는 법을 알아보겠습니다.
         *
         * 사인, 코사인, 탄젠트입니다.
         */

        System.out.println("===================================");

        double sin = Math.sin(9);
        double cos = Math.cos(9);
        double tan = Math.tan(9);

        System.out.println("sin : " + sin);
        System.out.println("cos : " + cos);
        System.out.println("tan : " + tan);

        /**
         * 사인, 코사인, 탄젠트를 구하는 방법입니다.
         * 이런 수학 공식들은 해당 공식을 사용하여 계산해야할 필요가 있을 때 사용하시면 좋습니다.
         *
         * Math 클래스에서 알아두실 메서드들은 이 정도면 좋을 것 같습니다.
         *
         * 감사합니다.
         *
         * 다음 강의에서 뵙겠습니다.
         */

        System.out.println("===================================");

    }

}

