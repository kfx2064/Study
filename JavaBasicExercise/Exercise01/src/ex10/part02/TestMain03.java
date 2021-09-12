package ex10.part02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain03 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("한국");
        list.add("미국");
        list.add("중국");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String obj : list) {
            System.out.println("obj : " + obj);
        }

        list.stream().sorted().forEach(System.out::println);

    }

}
