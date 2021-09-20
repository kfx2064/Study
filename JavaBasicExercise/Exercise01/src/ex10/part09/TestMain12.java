package ex10.part09;

import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain12 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "", "j", "k", "j");
        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        Stream<String> sorted = strings.stream().sorted();
        sorted.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Integer> sorted2 = numbers.stream().sorted();
        sorted2.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> limit = strings.stream().limit(3);
        limit.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> skipStream = strings.stream().skip(2);
        skipStream.forEach(i -> System.out.print(i + " "));

    }

}
