package exer01.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List7 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("c");
        list1.add("b");
        list1.add("a");

        list2.add("b");
        list2.add("c");
        list2.add("a");

        List7 list7 = new List7();
        list7.sort1(list1);
        list7.sort2(list2);

        System.out.println(list1);
        System.out.println(list2);

    }

    private void sort1(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sort2(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }

}
