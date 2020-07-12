package ch09.part02.main10.sub3;

import java.util.Comparator;
import java.util.List;

public class SortUtil {

    public static <T> void sort(List<T> list, Comparator<T> comparator) {

        if (list == null || list.size() <= 1) return;
        boolean isChanged = false;
        while (true) {
            isChanged = false;
            for (int i = 0; i < list.size() - 1; i++) {
                T p1 = list.get(i);
                T p2 = list.get(i+1);

                int result = comparator.compare(p1, p2);

                if (result > 0) {
                    list.set(i, p2);
                    list.set(i+1, p1);
                    isChanged = true;
                }
            }
            if (isChanged == false) break;
        }

    }

    public interface Comparator<T> {
        public int compare(T t1, T t2);
    }

}
