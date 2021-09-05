package ex07.part06;

import com.sun.jdi.IntegerValue;
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain01 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "", "j", "k", "j");
        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        Stream<Integer> sorted = numbers.stream().sorted();
        System.out.println("sorted");
        sorted.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> sorted2 = strings.stream().distinct().sorted((s1, s2) -> s1.compareTo(s2));
        System.out.println("sorted");
        sorted2.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Stream<String> limit = strings.stream().limit(3);
        System.out.println("limit()");
        limit.forEach(item -> System.out.print(item + " "));
        System.out.println();

    }

}
