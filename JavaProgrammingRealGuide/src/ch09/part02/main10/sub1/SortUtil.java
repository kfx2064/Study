package ch09.part02.main10.sub1;

import java.util.ArrayList;
import java.util.List;

public class SortUtil {

    public static void sort(List<Integer> list) {

        if (list == null || list.size() <= 1) return;
        boolean isChanged = false;
        while (true) {
            isChanged = false;
            for (int i = 0; i < list.size() - 1; i++) {
                Integer i1 = list.get(i);
                Integer i2 = list.get(i + 1);

                int result = 0;
                if (i1 > i2) result = 1;
                else if (i1 == i2) result = 0;
                else if (i1 < i2) result = -1;

                if (result == 1) {
                    list.set(i, i2);
                    list.set(i+1, i1);
                    isChanged = true;
                }
            }

            if (isChanged == false) break;
        }

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        System.out.println("처리 전 = " + list);

        sort(list);

        System.out.println("처리 후 = " + list);
    }

}
