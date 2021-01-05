package exer01.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List6 {

    public static void main(String[] args) {

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();

        names1.add("c");
        names1.add("b");
        names1.add("a");

        names2.add("b");
        names2.add("c");
        names2.add("a");

        List6 list6 = new List6();
        list6.sort1(names1);
        list6.sort2(names2);

        System.out.println(names1);
        System.out.println(names2);

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
