package ex08.part01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain02 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("aaa", "bbb", "", "CCC", "bbb");

        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        String[] array = strings.stream().toArray(String[]::new);
        System.out.println("toArray : " + Arrays.toString(array));

        Integer reduce1 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("reduce1 : " + reduce1);

        Set<String> collect = strings.stream().collect(Collectors.toSet());
        System.out.println("collect : " + collect);

        List<String> collect2 = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println("collect2 : " + collect2);

    }

}
