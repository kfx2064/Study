package lec01.array05.fifth;

import java.util.Arrays;

/**
 * 다섯 번째 배열 강의입니다.
 *
 * 그러면 강의를 진행하겠습니다.
 */
public class Array05 {

    public static void main(String[] args) {

        int arr1[][] = new int[2][1];

        /**
         * 두 가지 선언 방식이 있어요.
         * 앞서의 두 가지와는 다른 방식입니다.
         *
         * 보여드리겠습니다.
         */

        int[][] arr2 = new int[2][1];

        /**
         * 차이가 느껴지시나요?
         * 대괄호가 데이터타입 뒤에 붙느냐 변수명 뒤에 붙느냐입니다.
         * 1차원, 2차원 등에 모두 해당됩니다.
         *
         * 선호하시는 유형으로 하시면 되는데
         * 저는 개인적으로 데이터타입 뒤에 붙이는 것을 선호합니다.
         */

        arr1[0][0] = 1;
        arr1[1][0] = 2;

        System.out.println(Arrays.toString(arr1));

        /**
         * 이런, 값을 제대로 확인할 수 없군요.
         * 다른 방식으로 확인해 볼까요?
         */

        int save1 = arr1[0][0];
        int save2 = arr1[1][0];

        System.out.println("save1 : " + save1);
        System.out.println("save2 : " + save2);

        /**
         * 제대로 값들이 출력이 되지요?
         * 다른 걸 또 실습해 볼까요?
         */

        int[][] anotherArr1 = new int[2][2];
        anotherArr1[0][0] = 1;
        anotherArr1[0][1] = 2;
        anotherArr1[1][0] = 3;
        anotherArr1[1][1] = 4;

        /**
         * 이런 식으로도 2차원 배열을 만들 수 있습니다.
         * 출력해 볼까요?
         */

        System.out.println(anotherArr1[0][0]);
        System.out.println(anotherArr1[0][1]);
        System.out.println(anotherArr1[1][0]);
        System.out.println(anotherArr1[1][1]);

        /**
         * 잘 출력되지요?
         * 다른 방식으로도 출력해 볼까요?
         */

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int getVar = anotherArr1[i][j];
                System.out.println("getVar : " + getVar);
            }
        }

        /**
         * 어렵죠?
         * 반복문을 사용해서 값을 출력해 보았습니다.
         * 반복문을 안 배우셨으니 이해가 안 되시는 것이 당연하므로 초조해 하지 마세요.
         * 그냥 이런 방법도 있구나, 라고 생각하시면 됩니다.
         * 중요한 포인트는 배열에 담은 값을 확인하시는 것입니다.
         *
         * 이렇게 다차원 배열을 사용할 수 있어요.
         *
         * 다른 차원의 배열도 해볼까요?
         */
        
        String[][][] strMultiArr1 = new String[2][2][2];
        strMultiArr1[0][0][0] = "가";
        strMultiArr1[0][0][1] = "나";
        strMultiArr1[0][1][0] = "다";
        strMultiArr1[1][0][0] = "라";

        strMultiArr1[1][0][1] = "마";
        strMultiArr1[0][1][1] = "바";
        strMultiArr1[1][1][0] = "사";
        
        strMultiArr1[1][1][1] = "자";

        /**
         * 다차원 배열에 데이터를 입력했습니다.
         * 한 번 출력해 볼까요?
         */

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                for (int z = 0; z < 2; z++) {
                    String strValue = strMultiArr1[x][y][z];
                    System.out.print("strValue : " + strValue + "\t\t");
                }
            }
        }

        /**
         * 순서가 좀 꼬였네요.
         * 그래도 값이 출력되는 것을 확인하실 수 있지요?
         * 이렇게 다차원 배열을 할 수도 있습니다.
         *
         * 코딩을 하시다 보면 이 정도의 다차원 배열을 쓸 경우는 별로 없어요.
         * 사실 1차원 배열도 잘 사용하지 않습니다.
         * 주로 리스트를 많이 사용하지요.
         *
         * 이번 강의도 이 정도로 설명 드리고 마무리 짓겠습니다.
         *
         * 감사합니다.
         */

    }

}

