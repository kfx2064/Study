package lec01.array05.forth;

import java.util.Arrays;

/**
 * 배열 4번째 강의입니다.
 *
 * 이제 실습하겠습니다.
 */
public class Array04 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        System.out.println(Arrays.toString(arr1));

        /**
         * 배열의 값들을 잘 출력해 보았습니다.
         * 이번에 실습하려는 것은 계산된 값을 넣는 것입니다.
         * 한 번 해볼까요?
         */

        arr1[0] = arr1[1] + arr1[2];
        System.out.println("arr1[0] : " + arr1[0]);

        /**
         * 2 + 3은 5겠죠?
         * 사실 저런 계산은 잘 안 씁니다.
         * 그냥 임의로 해 본 거라고 생각해 주세요.
         *
         * 다른 방식으로도 해볼까요?
         */

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        int intVar1 = arr1[1];
        int intVar2 = arr1[2];
        arr1[0] = intVar1 + intVar2;
        System.out.println("arr1[0] : " + arr1[0]);

        /**
         * 계산이 잘 되지요?
         *
         * 이번 강의는 계산된 값을 배열에 넣는 것을 실습해 보았습니다.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         */


    }

}
