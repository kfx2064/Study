package ex10.part06;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TestMain07 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        IntStream range = IntStream.range(5, 9);
        range.forEach(item -> System.out.print(item + " "));
        System.out.println();

        IntStream rangeClosed = IntStream.rangeClosed(5, 9);
        rangeClosed.forEach(item -> System.out.print(item + " "));
        System.out.println();

        IntStream ints = new Random().ints();
        ints.limit(3).forEach(item -> System.out.print(item + " "));

    }

}
