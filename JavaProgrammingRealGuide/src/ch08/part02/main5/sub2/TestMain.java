package ch08.part02.main5.sub2;

import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("a");
        list1.add("b");

        System.out.println(list1);

        ArrayListUtil.add(list1, "c", "d", "e", "f");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        System.out.println(list2);

        ArrayListUtil.add(list2, 3, 4, 5);
        System.out.println(list2);

    }

}
