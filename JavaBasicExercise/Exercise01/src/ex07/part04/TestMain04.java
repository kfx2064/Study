package ex07.part04;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMain04 {

    public static void main(String[] args) {

        IntStream ints = new Random().ints();
        System.out.println("new Random ints");
        ints.limit(3).forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> generate = Stream.generate(() -> "generate");
        System.out.println("Stream generate");
        generate.limit(5).forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<Double> generate2 = Stream.generate(Math::random);
        generate2.limit(2).forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<Integer> iterate = Stream.iterate(1, n -> n + 2);
        System.out.println("Stream iterate");
        iterate.limit(3).forEach(item -> System.out.print(item + " "));


    }

}
