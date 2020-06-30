package ch06.part04.main3;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 6, 7, 2};

        Arrays.sort(arr);

        String toString = Arrays.toString(arr);
        System.out.println(toString);

    }

}
