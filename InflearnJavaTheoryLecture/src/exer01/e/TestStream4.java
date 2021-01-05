package exer01.e;

import java.util.ArrayList;
import java.util.List;

public class TestStream4 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);

        list.stream().sorted().forEach(System.out::println);

    }

}
