package lec05.generics.forth;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 이번 강의에서는 컬렉션을 활용하여 제네릭스를 이것저것 활용해 보겠습니다.
 */
public class GenericsCollections {

    public static void main(String[] args) {

        // 먼저 리스트를 활용해 보겠습니다.
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(90);
        scoreList.add(85);
        scoreList.add(95);
        scoreList.add(100);
        scoreList.add(80);

        for (int score : scoreList) {
            System.out.print(score + "\t\t\t");
        }

        /**
         * int의 Wrapper 클래스 Integer를 활용하여 숫자값을 넣는 것을 해보았습니다.
         * 이번엔 String을 해볼까요?
         */
        ArrayList<String> lectureList = new ArrayList<>();
        lectureList.add("국어");
        lectureList.add("수학");
        lectureList.add("영어");
        lectureList.add("과학");
        lectureList.add("사회");
        lectureList.add("국사");

        /**
         * 풀어내 보겠습니다.
         */
        System.out.println();
        for (String lecture : lectureList) {
            System.out.print("과목 : " + lecture + "\t\t");
        }

        /**
         * 리스트는 잘 보았지요?
         * 이번엔 다른 것을 해볼까요?
         */

        HashMap<String, String> mapCountry = new HashMap<>();
        mapCountry.put("한국", "아시아");
        mapCountry.put("미국", "아메리카");
        mapCountry.put("프랑스", "유럽");
        mapCountry.put("소말리아", "아프리카");

        System.out.println();
        System.out.println(mapCountry.toString());

        /**
         * 데이터가 잘 들어간 것이 보이지요?
         * 이런 식으로 제네릭스가 가장 많이 활용됩니다.
         *
         * 컬렉션 프레임워크의 자료형들의 타입을 지정해 주는 용도로 말이죠.
         *
         * 그럼 이번 실습은 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

}
