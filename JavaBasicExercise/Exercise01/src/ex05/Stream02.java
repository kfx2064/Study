package ex05;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream02 {

    public static void main(String[] args) {

        Stream<String> streamEmpty = Stream.empty();
        System.out.println("streamEmpty : " + streamEmpty);

        Stream<String> nullStringStream = streamOf(null);
        System.out.println("nullStringStream : " + nullStringStream);

        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        System.out.println("streamOfArray : " + streamOfArray);
        streamOfArray.forEach(s -> {
            System.out.print(s + ", ");
        });
        System.out.println();

        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        streamOfArrayFull.forEach(s -> {
            System.out.print(s + ", ");
        });
        System.out.println();

        streamOfArrayPart.forEach(s -> {
            System.out.print(s + ", ");
        });
        System.out.println();

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        streamGenerated.forEach(s -> {
            System.out.print(s + ", ");
        });
        System.out.println();

        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        streamIterated.forEach(i -> {
            System.out.print(i + ", ");
        });
        System.out.println();

        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        intStream.forEach(i -> {
            System.out.print(i + ", ");
        });
        System.out.println();

        longStream.forEach(i -> {
            System.out.print(i + ", ");
        });
        System.out.println();

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(v -> {
            System.out.print(v + ", ");
        });
        System.out.println();

        IntStream streamOfChars = "abc".chars();
        streamOfChars.forEach(i -> {
            System.out.print(i + ", ");
        });
        System.out.println();

        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");
        streamOfString.forEach(s -> {
            System.out.print(s + ", ");
        });
        System.out.println();

        Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        stream.forEach(s -> {
            System.out.print(s + ", ");
        });
        stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny();
        String anyStreamGet = anyElement.get();
        System.out.println("anyStreamGet : " + anyStreamGet);
    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

}
