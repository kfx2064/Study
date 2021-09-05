package ex07.part03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMain03 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        Stream<String> stream5 = Stream.of(array);
        System.out.println("stream.of");
        stream5.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream6 = Stream.empty();
        System.out.println("Stream empty");
        System.out.println(stream6.count());

        IntStream range = IntStream.range(5, 9);
        System.out.println("IntStream.range(5, 9)");
        range.forEach(item -> System.out.print(item + " "));
        System.out.println();

        IntStream rangeClosed = IntStream.rangeClosed(5, 9);
        System.out.println("IntStream.rangeClosed");
        rangeClosed.forEach(item -> System.out.print(item + " "));
        System.out.println();

    }

}
