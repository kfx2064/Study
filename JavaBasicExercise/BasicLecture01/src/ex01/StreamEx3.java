package ex01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {

    public static void main(String[] args) {

        //ex1();
        //ex2();
        ex3();

    }

    public static void ex3() {
        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        intStream1.skip(5).limit(5).forEach(System.out::println);
    }

    public static void ex2() {
        String[] arrStr1 = new String[]{"a", "b", "c"};
        String[] arrStr2 = new String[]{"가", "나", "다"};

        Stream<String> strStream1 = Stream.of(arrStr1);
        Stream<String> strStream2 = Arrays.stream(arrStr2);
        Stream<String> strStreamConcat = Stream.concat(strStream1, strStream2);

        strStreamConcat.forEach(System.out::println);
    }

    public static void ex1() {

        Stream<Integer> stream1 = Stream.iterate(0, n -> n+2);
        stream1.limit(7).forEach(System.out::println);

        System.out.println("==============================");

        IntStream intStream1 = IntStream.generate(() -> 1);
        intStream1.limit(3).forEach(System.out::println);

    }

}
