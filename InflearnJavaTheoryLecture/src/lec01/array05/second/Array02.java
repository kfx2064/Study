package lec01.array05.second;

import java.util.Arrays;

/**
 * 배열 두 번째 강의입니다.
 * 잘 따라와 주세요.
 */
public class Array02 {

    /**
     * 메인 메서드를 만듭니다.
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));

        /**
         * 배열을 선언하는 또 다른 방식입니다.
         * 이번엔 다르게 또 해볼까요?
         */

        int one = arr[0];
        int two = arr[1];
        int three = arr[2];

        System.out.println("one : " + one);
        System.out.println("two : " + two);
        System.out.println("three : " + three);

        /**
         * 1, 2, 3이 출력되네요.
         * 잘 확인하셨죠?
         * 저런 방식으로도 배열의 선언과 초기화가 가능합니다.
         * 이런 것들은 1차원 배열의 방식입니다.
         * 그러면 다음 강의부터는 또 다른 실습들을 진행해 보겠습니다.
         *
         * 감사합니다.
         */

    }

}

