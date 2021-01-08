package exer01.g;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};

        Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
        System.out.println(1);
        stream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream1 = Stream.of(array);
        System.out.println(2);
        stream1.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream2 = Stream.empty();
        System.out.println(3);
        System.out.println(stream2.count());

    }
}
