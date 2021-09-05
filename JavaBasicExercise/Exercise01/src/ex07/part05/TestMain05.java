package ex07.part05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain05 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "", "j", "k", "j");
        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        Stream<String> filter = strings.stream().filter(s -> !s.isEmpty());
        System.out.println("filter");
        filter.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<Integer> filter2 = numbers.stream().filter(i -> i > 2);
        System.out.println("filter");
        filter2.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> distinct = strings.stream().distinct().filter(s -> !s.isEmpty());
        System.out.println("distinct");
        distinct.forEach(item -> System.out.print(item + " "));
        System.out.println();

    }

}
