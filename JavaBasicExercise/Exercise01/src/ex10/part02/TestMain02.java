package ex10.part02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain02 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("아메리카노");
        list.add("카페라떼");
        list.add("카페모카");

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