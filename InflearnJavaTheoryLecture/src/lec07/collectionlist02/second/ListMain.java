package lec07.collectionlist02.second;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>();

        aList.add("삼성전자");
        aList.add("SK하이닉스");
        aList.add("현대자동차");
        aList.add("LG전자");

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        /**
         * 자료를 삭제합니다.
         */
        System.out.println(aList.toString());
        aList.remove(1);
        System.out.println(aList.toString());
        aList.remove("LG전자");
        System.out.println(aList.toString());

        /**
         * 그럼 다음 강의로 넘어가겠습니다.
         */

    }

}
