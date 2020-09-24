package lec01.array05.first;

import java.util.Arrays;

/**
 * 배열 첫 번째 강의입니다.
 *
 * 잘 따라와 주세요.
 */
public class Array01 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 쉽게 실습을 진행해 보면서 점차 단계를 올려가는 방식으로 실습하겠습니다.
         */

        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        /**
         * Arrays 함수를 사용하여 arr, 즉 배열에 담은 데이터를 확인했습니다.
         * 1, 2, 3을 첫 번째, 두 번째, 세 번째에 담는 것을 확인했지요?
         * 이번엔 다르게 데이터를 불러볼까요?
         */

        int first = arr[0];
        int second = arr[1];
        int third = arr[2];

        System.out.println("first : " + first);
        System.out.println("second : " + second);
        System.out.println("third : " + third);

        /**
         * 데이터가 하나씩 잘 찍히지요?
         * 이런 식으로 배열을 선언해 줄 수 있습니다.
         * 이번 강의는 여기까지 진행하겠습니다.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         * 감사합니다.
         */

    }

}

