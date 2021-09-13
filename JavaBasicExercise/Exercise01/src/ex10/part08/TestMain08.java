package ex10.part08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain08 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "", "j", "k", "j");
        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        Stream<String> filter = strings.stream().filter(s -> !s.isEmpty());
        filter.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Integer> filter2 = numbers.stream().filter(i -> i > 2);
        filter2.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> distinct = strings.stream().distinct().filter(s -> !s.isEmpty());
        distinct.forEach(i -> System.out.print(i + " "));

    }

}
