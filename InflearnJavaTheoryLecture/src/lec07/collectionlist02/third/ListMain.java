package lec07.collectionlist02.third;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        /**
         * 포함 여부를 보겠습니다.
         */

        boolean contains = aList.contains(1);
        System.out.println("1을 포함하고 있는가 : " + contains);

        /**
         * 일부를 추출해 보겠습니다.
         */

        List<Integer> integers = aList.subList(0, 2);
        System.out.println("index 0부터 2미만까지 추출 : " + integers);

        /**
         * 리스트를 하나 만들어서 통째로 추가해 보겠습니다.
         */

        List<Integer> bList = new ArrayList<>();
        bList.add(7);
        bList.add(8);
        bList.add(9);

        aList.addAll(bList);
        System.out.println(aList.toString());

        System.out.println();

        boolean b = aList.containsAll(bList);
        System.out.println("일괄포함여부 : " + b);

        System.out.println("일괄삭제");
        System.out.println(aList.toString());
        aList.removeAll(bList);
        System.out.println(aList.toString());

        System.out.println("다시 등록");
        aList.addAll(bList);
        System.out.println(aList.toString());

        System.out.println("공통 자료 남기기");
        aList.retainAll(bList);
        System.out.println(aList.toString());

    }

}
