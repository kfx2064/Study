package ch09.part02.main10.sub3;

import ch09.part02.main10.sub2.ProductVo;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(4);
        list1.add(3);
        list1.add(1);
        list1.add(2);
        list1.add(5);

        System.out.println("처리 전 = " + list1);

        SortUtil.sort(list1, new SortUtil.Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                int result = 0;
                if (t1 > t2) {
                    result = 1;
                } else if (t1 == t2) {
                    result = 0;
                } else if (t1 < t2) {
                    result = -1;
                }
                return result;
            }
        });

        System.out.println("처리 후 = " + list1);

        List<ProductVo> list2 = new ArrayList<>();

        list2.add(new ProductVo("a001", "아메리카노", 4000));
        list2.add(new ProductVo("a002", "카페라떼", 4300));
        list2.add(new ProductVo("a003", "카페모카", 4500));

        System.out.println("정렬 전 = " + list2);
        SortUtil.sort(list2, new SortUtil.Comparator<ProductVo>() {
            @Override
            public int compare(ProductVo t1, ProductVo t2) {
                int result = 0;
                if (t1 == null && t2 != null) {
                    result = 1;
                } else if (t1 != null && t2 != null) {
                    result = -1;
                } else if (t1 == null && t2 == null) {
                    result = 0;
                } else {
                    String productName1 = t1.getProductName();
                    String productName2 = t2.getProductName();
                    result = productName1.compareTo(productName2);
                }
                return result;
            }
        });
        System.out.println("정렬 후 = " + list2);
    }

}
