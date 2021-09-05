package ex06.part05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TM03 {

    public static void main(String[] args) {

        List<String> names1 = new ArrayList<>();
        names1.add("b");
        names1.add("c");
        names1.add("a");

        List<String> names2 = new ArrayList<>();
        names2.add("b");
        names2.add("c");
        names2.add("a");

        TM03 test = new TM03();

        test.sort1(names1);
        test.sort2(names2);

        System.out.println(names1);
        System.out.println(names2);

    }

    private void sort1(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    private void sort2(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }

}
