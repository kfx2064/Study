package exer01.f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};

        List<String> list = Arrays.asList(array);

        Stream<String> stream = list.stream();
        System.out.println("stream");
        stream.forEach(item -> System.out.println(item + " "));

        Stream<String> stream2 = Arrays.stream(array);
        System.out.println("stream");
        stream2.forEach(item -> System.out.println(item + " "));

        Stream<String> stream3 = Arrays.stream(array, 1, 3);
        System.out.println("stream");
        stream3.forEach(item -> System.out.println(item + " "));

        Stream stream4 = Stream.of("a", "b", "c", "d", "e");
        System.out.println("Stream.of");
        stream4.forEach(item -> System.out.println(item + " "));
        System.out.println();

        Stream<String> stream6 = Stream.empty();
        System.out.println("Stream.empty() : count " + stream6.count());

    }

}
