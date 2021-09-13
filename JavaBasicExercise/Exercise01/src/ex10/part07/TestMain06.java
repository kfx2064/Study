package ex10.part07;

import java.util.stream.Stream;

public class TestMain06 {

    public static void main(String[] args) {

        Stream<String> generate = Stream.generate(() -> "generate");
        generate.limit(3).forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<Double> generate2 = Stream.generate(Math::random);
        generate2.limit(3).forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<Integer> iterate = Stream.iterate(1, n -> n + 2);
        iterate.limit(3).forEach(item -> System.out.print(item + " "));

    }

}
