package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {

    public static void main(String[] args) {

        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();

    }

    public static void ex5() {
        IntStream intStream1 = new Random().ints(3);
        intStream1.forEach(System.out::println);
    }

    public static void ex4() {
        IntStream intStream1 = new Random().ints();
        intStream1.limit(5).forEach(System.out::println);
    }

    public static void ex3() {

        int[] arrInt1 = new int[]{1, 2, 3, 4, 5};
        IntStream intStream1 = IntStream.range(2, 5);
        intStream1.forEach(System.out::println);

    }

    public static void ex2() {

        Stream<String> strStream1 = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c", "d"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);

        String[] arrStr1 = new String[]{"1", "2", "3"};
        String[] arrStr2 = new String[]{"1", "2", "3", "4", "5"};

        Stream<String> strStream11 = Stream.of(arrStr1);
        Stream<String> strStream22 = Arrays.stream(arrStr2);

        System.out.println("strStream1");
        strStream1.forEach(System.out::println);

        System.out.println("strStream2");
        strStream2.forEach(System.out::println);

        System.out.println("strStream3");
        strStream3.forEach(System.out::println);

        System.out.println("strStream4");
        strStream4.forEach(System.out::println);

        System.out.println("strStream11");
        strStream11.forEach(System.out::println);

        System.out.println("strStream22");
        strStream22.forEach(System.out::println);

    }

    public static void ex1() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);

        Stream<Integer> intStream = list.stream();
        System.out.println(intStream);

        intStream.forEach(System.out::println);

    }

}
