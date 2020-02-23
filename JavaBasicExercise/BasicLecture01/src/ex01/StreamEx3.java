package ex01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {

    public static void main(String[] args) {

        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();

    }

    public static void ex5() {
        int[] arrInt1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream1 = IntStream.of(arrInt1);

        intStream1.filter(i -> i % 2 == 0).forEach(System.out::println);
    }

    public static void ex4() {
        IntStream intStream1 = IntStream.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8, 9, 10);
        intStream1.distinct().forEach(System.out::println);
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
