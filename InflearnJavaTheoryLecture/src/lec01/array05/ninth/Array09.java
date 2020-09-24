package lec01.array05.ninth;

import java.util.Arrays;

/**
 * 배열에 대한 강의입니다.
 */
public class Array09 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        int[] intArr1 = new int[]{5, 9, 3, 1, 2};
        System.out.println(Arrays.toString(intArr1));

        Arrays.sort(intArr1);
        System.out.println("정렬된 배열 : " + Arrays.toString(intArr1));

        /**
         * sort는 배열의 정렬 기능입니다.
         * 숫자를 저렇게 정렬을 하죠.
         * 다른 것도 정렬해 볼까요?
         */

        String[] strArr1 = new String[]{"볼트", "나사", "스크류", "드라이버", "못"};
        System.out.println(Arrays.toString(strArr1));
        Arrays.sort(strArr1);
        System.out.println("정렬된 문자열 배열 : " + Arrays.toString(strArr1));

        /**
         * 한글도 정렬이 됩니다.
         * sort는 기본으로 가, 나, 다 순으로 정렬이 됩니다.
         *
         * 배열에 대한 강의는 여기서 마무리하는 것이 좋을 것 같습니다.
         *
         * 감사합니다.
         */

    }

}
