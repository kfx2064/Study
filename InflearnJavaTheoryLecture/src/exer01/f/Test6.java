package exer01.f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test6 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};

        List<String> list = Arrays.asList(array);

        Stream<String> stream1 = list.stream();
        System.out.println(1);
        stream1.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(array);
        System.out.println(2);
        stream2.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream3 = Arrays.stream(array, 1, 3);
        System.out.println(3);
        stream3.forEach(item -> System.out.print(item + " "));
        System.out.println();


    }

}
