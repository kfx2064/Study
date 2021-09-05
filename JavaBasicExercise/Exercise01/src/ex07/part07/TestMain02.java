package ex07.part07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain02 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "", "j", "k", "j");
        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        Stream<String> skipStream = strings.stream().skip(2);
        System.out.println("skip");
        skipStream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> stream1 = strings.stream().distinct().filter(item -> !item.isEmpty());
        Stream<String> stream2 = Arrays.asList("m", "j").stream();
        Stream<String> concat = Stream.concat(stream1, stream2);
        System.out.println("concat");
        concat.forEach(item -> System.out.print(item + " "));

    }

}
