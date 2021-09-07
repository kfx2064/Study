package ex07.part08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain01 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("aaa", "", "bbb", "CCC", "bbb");

        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        long count = numbers.stream().count();
        System.out.println("count() : " + count);

        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("max() : " + max.get());

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("min() : " + min.get());

        Optional<String> findFirst = strings.stream().filter(s -> s.contains("b")).findFirst();
        System.out.println("findFirst() : " + findFirst.get());

        Optional<String> findAny = strings.stream().filter(s -> !s.isEmpty()).findAny();
        System.out.println("findAny() : " + findAny.get());

        boolean anyMatch = strings.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println("anyMatch() : " + anyMatch);

        boolean allMatch = strings.stream().allMatch(s -> s.startsWith("a"));
        System.out.println("allMatch() : " + allMatch);

        boolean noneMatch = strings.stream().noneMatch(s -> s.startsWith("D"));
        System.out.println("noneMatch() : " + noneMatch);

        String[] array = strings.stream().toArray(String[]::new);
        System.out.println("toArray() : " + Arrays.toString(array));

        Integer reduce1 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("reduce() : " + reduce1);

        Set<String> collect = strings.stream().collect(Collectors.toSet());
        System.out.println("collect() : " + collect);

        List<String> collect2 = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println("collect() : " + collect2);
    }

}
