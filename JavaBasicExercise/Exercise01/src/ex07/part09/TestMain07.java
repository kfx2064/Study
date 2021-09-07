package ex07.part09;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestMain07 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

        long count = numbers.stream().count();
        System.out.println("count() : " + count);

        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("max() : " + max.get());

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("min() : " + min.get());

    }

}
