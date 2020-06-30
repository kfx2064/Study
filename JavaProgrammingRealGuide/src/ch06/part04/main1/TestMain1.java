package ch06.part04.main1;

import java.util.Arrays;

public class TestMain1 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 5, 2, 4};

        int[] arr2 = new int[5];
        System.arraycopy(arr1, 1, arr2, 0, 2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("배열[" + i + "]=" + arr2[i]);
        }

        String toString = Arrays.toString(arr1);
        System.out.println(toString);

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }

}
