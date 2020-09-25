package lec02.forlecture;

import java.util.ArrayList;
import java.util.List;

/**
 * 반복문 클래스를 작성하겠습니다.
 */
public class For02 {

    /**
     * 메인메서드를 만들었습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 임의로 컬렉션 프레임워크 중 리스트를 만들었습니다.
         *
         * 모르셔도 무방합니다.
         * 아직 안 배웠으니까요.
         *
         * 가볍게 보시고 넘어가세요.
         */
        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        /**
         * 데이터를 추가했습니다.
         * 추가된 데이터를 반복문을 통해 풀어가며 출력하겠습니다.
         */

        for (int i : intList) {
            System.out.println("i : " + i);
        }

        /**
         * 데이터가 출력되는 것이 보이시죠?
         *
         * 다른 예를 보여 드리겠습니다.
         */

        String[] arrStrCountry = new String[]{"한국", "미국", "중국", "러시아", "일본"};

        for (String strCountry : arrStrCountry) {
            System.out.println("나라 이름 : " + strCountry);
        }

        /**
         * 나라 이름을 반복문을 통해 풀어냈지요.
         * 여기서 보시면 아실 수 있는 것은 인덱스를 통제할 수 없다는 것입니다.
         * 인덱스를 통제할 수 없으므로 향상된 for문은 데이터를 풀어내기에는 좋지만
         * 인덱스를 통해 특정 값을 통제하는데는 좋지 않습니다.
         *
         * 그래서 향상된 for문보다는 전통적인 for문을 더 많이 사용합니다.
         *
         * 이번 강의는 여기까지 하겠습니다.
         *
         * 감사합니다.
         */

    }

}
