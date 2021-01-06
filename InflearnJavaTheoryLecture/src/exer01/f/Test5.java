package exer01.f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test5 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};

        List<String> list = Arrays.asList(array);

        Stream<String> stream = list.stream();
        System.out.println(1);
        stream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream1 = Arrays.stream(array);
        System.out.println(2);
        stream1.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(array, 1, 3);
        System.out.println(3);
        stream2.forEach(item -> System.out.print(item + " "));
        System.out.println();

    }

}
