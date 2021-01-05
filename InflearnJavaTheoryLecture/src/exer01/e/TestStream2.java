package exer01.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestStream2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("한국");
        list.add("러시아");
        list.add("미국");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("list");
        System.out.println(list);

        list.add("가나");
        list.add("프랑스");

        list.stream().sorted().forEach(System.out::println);


    }

}
