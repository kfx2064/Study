package ex07.part02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain04 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        Stream<String> stream = list.stream();
        System.out.println("collection stream");
        stream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(array);
        System.out.println("Arrays.stream");
        stream2.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream3 = Arrays.stream(array, 1, 3);
        System.out.println("Arrays.stream(1, 3)");
        stream3.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream4 = Stream.of("a", "b", "c", "d", "e");
        System.out.println("Stream.of");
        stream4.forEach(item -> System.out.print(item + " "));
        System.out.println();

    }

}
