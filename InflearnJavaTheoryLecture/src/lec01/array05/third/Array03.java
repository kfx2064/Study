package lec01.array05.third;

import java.util.Arrays;

/**
 * 배열 세 번째 강의입니다.
 * 
 * 잘 봐주세요.
 */
public class Array03 {

    public static void main(String[] args) {
        
        String[] strArr = new String[3];
        strArr[0] = "정부";
        strArr[1] = "종합";
        strArr[2] = "청사";

        System.out.println(Arrays.toString(strArr));

        /**
         * 테스트 데이터를 넣어서 돌려봤습니다.
         * String도 잘 된다는 걸 보여드리고 싶었어요.
         *
         * 다른 식으로도 해볼까요?
         */

        String[] strArr1 = new String[]{"Hello", "World"};
        System.out.println(Arrays.toString(strArr1));

        /**
         * 동작하죠?
         * 배열에 올바른 한글값들이 확인되었습니다.
         *
         * String 배열도 가능하단 걸 보여드리려고 한 것이었습니다.
         *
         * 실수형도 한 번 해볼까요?
         */

        double[] dbArray1 = new double[3];
        dbArray1[0] = 1.1;
        dbArray1[1] = 2.1;
        dbArray1[2] = 3.1;

        System.out.println(Arrays.toString(dbArray1));

        /**
         * 실수형도 잘 동작하네요.
         *
         * 이번 강의는 각 자료형도, 즉 각각의 데이터타입들도 잘 동작한다는 것을
         * 확인하는 것으로 마치겠습니다.
         *
         * 감사합니다.
         */

    }
    
}
