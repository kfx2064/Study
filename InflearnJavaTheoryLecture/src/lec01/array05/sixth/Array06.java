package lec01.array05.sixth;

import java.util.Arrays;

/**
 * 배열 여섯 번째 강의입니다.
 */
public class Array06 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        String[] strArr1 = new String[]{"서울", "경기", "인천"};

        /**
         * 배열의 길이를 구해볼까요?
         */

        int arrLength = strArr1.length;
        System.out.println("arrLength : " + arrLength);

        for (int i = 0; i < arrLength; i++) {
            String strValue = strArr1[i];
            System.out.println(i + " : " + strValue);
        }

        /**
         * 배열의 길이는 이런 식으로 자주 활용됩니다.
         * 길이를 구해서 반복문을 통해 각각의 인덱스로 값을 추출합니다.
         * 그리고 그 인덱스 값을 통해서 개별 값을 구하는 것이죠.
         * 다른 것도 실습해 보겠습니다.
         */

        int[] intArr1 = new int[]{1, 2, 3};
        int intLength1 = intArr1.length;
        System.out.println("정수형 배열 값 출력 : " + Arrays.toString(intArr1));

        for (int i = 0; i < intLength1; i++) {
            intArr1[i] = (i + 5);
        }

        System.out.println("새로운 값 저장 후 정수형 배열 값 출력 : " + Arrays.toString(intArr1));

        /**
         * 저런 식으로 배열에 새로운 값을 입력해 줄 수 있습니다.
         *
         * 이 정도 실습하면 좋은 것 같습니다.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         */

    }

}
