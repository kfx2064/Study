package ch08.part02.main5.sub1;

import java.util.ArrayList;

public class TestMain2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

    }

}
