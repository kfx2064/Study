package ex07.part10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestMain04 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);
        List<String> strings = Arrays.asList("aaa", "bbb", "", "CCC", "bbb");

        Optional<String> findFirst = strings.stream().filter(s -> s.contains("b")).findFirst();
        System.out.println("findFirst : " + findFirst.get());

        Optional<String> findAny = strings.stream().filter(s -> s.isEmpty()).findAny();
        System.out.println("findAny : " + findAny.get());

        boolean anyMatch = strings.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println("anyMatch : " + anyMatch);

        boolean allMatch = strings.stream().allMatch(s -> s.startsWith("a"));
        System.out.println("allMatch : " + allMatch);

    }

}
