package ch08.part02.main5.sub2;

import java.util.ArrayList;

public class ArrayListUtil {

    public static void add(ArrayList<String> list, String... str) {
        System.out.println("\t add(ArrayList<String> list, String... str) 실행");
        if (list == null || str == null) {
            return;
        }

        for (String s : str) {
            list.add(s);
        }
    }

    public static <T> void add(ArrayList<T> list, T... str) {
        System.out.println("\t add(ArrayList<T> list, T... str");
        if (list == null || str == null) {
            return;
        }

        for (T s : str) {
            list.add(s);
        }
    }

}
