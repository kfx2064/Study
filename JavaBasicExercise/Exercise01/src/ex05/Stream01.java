package ex05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Stream01 {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int paramInt = (int) (Math.random() * 10);
            System.out.println(paramInt);
            String pStr = String.valueOf(paramInt);
            arrList.add(pStr);
        }

        System.out.println(arrList.toString());

        Stream<String> stream = arrList.stream();

    }

}
