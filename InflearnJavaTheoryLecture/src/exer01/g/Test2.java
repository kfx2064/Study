package exer01.g;

import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};

        Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
        System.out.println("Stream.of");
        stream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream1 = Stream.of(array);
        System.out.println("Stream.of");
        stream1.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<Object> empty = Stream.empty();
        System.out.println(empty.count());

    }

}
