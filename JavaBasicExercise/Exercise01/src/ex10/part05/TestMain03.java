package ex10.part05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain03 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        Stream<String> stream = list.stream();
        stream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(array);
        stream2.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream3 = Arrays.stream(array, 1, 3);
        stream3.forEach(item -> System.out.print(item + " "));
        System.out.println();

    }

}
