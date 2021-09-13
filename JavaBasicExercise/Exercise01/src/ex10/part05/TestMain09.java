package ex10.part05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain09 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        Stream<String> stream4 = Stream.of("a", "b", "c", "d", "e");
        stream4.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream5 = Stream.of(array);
        stream5.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream6 = Stream.empty();
        System.out.println("count : " + stream6.count());

    }

}
