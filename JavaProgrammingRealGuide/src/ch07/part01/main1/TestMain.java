package ch07.part01.main1;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {

        String[] arr11 = {"a", "b", "c"};
        System.out.println("arr11 기존 - " + Arrays.toString(arr11));
        String[] arr12 = ArrayUtil.add(arr11, "ddd");
        System.out.println("arr12 추가 - " + Arrays.toString(arr12));
        String[] arr13 = ArrayUtil.remove(arr12, 0);

    }

}
