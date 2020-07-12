package ch09.part02.main10.sub2;

import java.util.ArrayList;
import java.util.List;

public class SortUtil {

    public static void sort(List<ProductVo> list) {
        if (list == null || list.size() <= 1) return;
        boolean isChanged = false;
        while (true) {
            isChanged = false;
            for (int i = 0; i < list.size() - 1; i++) {
                ProductVo p1 = list.get(i);
                ProductVo p2 = list.get(i+1);

                int result = 0;
                if (p1 == null && p2 != null) {
                    result = 1;
                } else if (p1 != null && p2 == null) {
                    result = -1;
                } else if (p1 == null && p2 == null) {
                    result = 0;
                } else {
                    String productName1 = p1.getProductName();
                    String productName2 = p2.getProductName();
                    result = productName1.compareTo(productName2);
                }

                if (result > 0) {
                    list.set(i, p2);
                    list.set(i+1, p1);
                    isChanged = true;
                }
            }

            if (isChanged == false) break;
        }
    }

    public static void main(String[] args) {

        List<ProductVo> list = new ArrayList<>();

        list.add(new ProductVo("a002", "카페라떼", 4300));
        list.add(new ProductVo("a001", "아메리카노", 4000));
        list.add(new ProductVo("a003", "카페모카", 4500));

        System.out.println("정렬 전 = " + list);

        SortUtil.sort(list);

        System.out.println("정렬 후 = " + list);

    }

}
