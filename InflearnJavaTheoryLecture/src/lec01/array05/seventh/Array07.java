package lec01.array05.seventh;

/**
 * 배열 강의를 진행하겠습니다.
 */
public class Array07 {

    /**
     * 메인 메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 문자열 다차원 배열을 선언하겠습니다.
         */
        String[] strArr1 = new String[]{"한국", "미국", "북한", "중국", "러시아", "일본"};
        String[] strArr2 = new String[]{"한반도", "아메리카", "북쪽", "동북아시아", "동유럽", "열도"};
        String[][] strArr3 = new String[][]{strArr1, strArr2};

        for (int x = 0; x < strArr3.length; x++) {
            for (int y = 0; y < strArr3[x].length; y++) {
                String strValue = strArr3[x][y];
                System.out.println("strValue : " + strValue);
            }
        }

        /**
         * 잘 출력되지요?
         * 여기서 주목해야 할 포인트는 1차원 배열을 각각 선언해서
         * 2차원 배열에 파라미터로 값을 담아 배열을 선언했다는 것입니다.
         *
         * 그것을 반복문을 통해서 풀어냈다는 거구요.
         * 이를 통해서 문자열 다차원 배열의 값을 확인해 볼 수 있습니다.
         *
         * 이번 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

}
