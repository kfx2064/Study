package exer01.d;

import java.lang.invoke.StringConcatFactory;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List4 {

    public static void main(String[] args) {

        List<String> strList1 = new ArrayList<>();
        strList1.add("d");
        strList1.add("c");
        strList1.add("b");
        strList1.add("a");

        List<String> strList2 = new ArrayList<>();
        strList2.add("a");
        strList2.add("d");
        strList2.add("c");
        strList2.add("b");
        strList2.add("e");

        List4 list4 = new List4();
        list4.sort1(strList1);
        list4.sort2(strList2);

        System.out.println(strList1);
        System.out.println(strList2);

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
