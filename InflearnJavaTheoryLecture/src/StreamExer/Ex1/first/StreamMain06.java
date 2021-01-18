package StreamExer.Ex1.first;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain06 {

    public static void main(String[] args) {

        /**
         * 스트림의 개수를 구합니다.
         */

        long getCountNumber = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println("스트림의 총 개수 : " + getCountNumber);

        long getCountNumber01 =
                Stream.of("Ship", "Energy", "Plant", "Special", "Robot", "Engine").count();
        System.out.println("스트림의 총 개수 : " + getCountNumber01);

        /**
         * 최대값을 구합니다.
         */

        Optional<Integer> maxStream01 = Stream.of(3, 5, 1).max(Integer::compare);
        Integer integer = maxStream01.get();
        System.out.println("최대값 : " + integer);

        /**
         * 최소값을 구합니다.
         */

        Optional<Integer> min = Stream.of(3, 5, 1).min(Integer::compare);
        Integer integer1 = min.get();
        System.out.println("최소값 : " + integer1);

        /**
         * 스트림에서 첫번째 값을 구합니다.
         */

        Optional<String> first
                = Stream.of("", "account", "", "humanresource", "procurement", "sales", "manufacturing")
                .filter(s -> !s.isEmpty())
                .findFirst();
        System.out.println("일치하는 첫 번째 값 : " + first.get());

        Optional<String> first1 = Stream.of("반도체", "가전", "전장").findFirst();
        System.out.println("일치하는 첫 번째 값 : " + first1.get());

        /**
         * 아무 값이나 반환합니다.
         */

        Optional<String> any
                = Stream.of("", "account", "", "humanresource", "procurement", "sales", "manufacturing")
                .filter(s -> !s.isEmpty())
                .findAny();
        System.out.println(any.get());

        Optional<String> any1 = Stream.of("반도체", "가전", "전장").findAny();
        System.out.println(any1.get());

        /**
         * 조건에 맞는 값이 하나라도 있는지 여부를 반환합니다.
         */
        boolean b = Stream.of("samsung", "lg", "hyundai", "sk").anyMatch(s -> s.startsWith("s"));
        System.out.println("anyMatch : " + b);

        boolean b1 = Stream.of("samsung", "lg", "hyundai", "sk").anyMatch(s -> s.startsWith("D"));
        System.out.println("anyMatch : " + b1);

        boolean b2 = Stream.of("samsung", "lg", "hyundai", "sk").allMatch(s -> s.equals("samsung"));
        System.out.println("allMatch : " + b2);

        /**
         * 조건에 전체 일치하는지 여부를 확인합니다.
         */

        boolean b3 = Stream.of("samsung", "samsung", "samsung", "samsung").allMatch(s -> s.equals("samsung"));
        System.out.println("allMatch : " + b3);

        boolean b4 = Stream.of("samsung", "samsung", "samsung", "samsung").allMatch(s -> s.startsWith("s"));
        System.out.println("allMatch : " + b4);

        /**
         * 일치하지 않는게 있는지 확인합니다.
         */

        boolean b5 = Stream.of("samsung", "lg", "hyundai", "sk").noneMatch(s -> s.equals("samsung"));
        System.out.println("noneMatch : " + b5);

        boolean b6 = Stream.of("samsung", "lg", "hyundai", "sk").noneMatch(s -> s.equals("ls"));
        System.out.println("noneMatch : " + b6);

        /**
         * 스트림의 구성 요소를 배열로 반환합니다.
         */

        String[] strings =
                Stream.of("korea", "america", "japan", "china", "russia").toArray(String[]::new);
        System.out.println("스트림 -> 배열 : " + Arrays.toString(strings));

        Integer reduce = Stream.of(1, 2, 3).reduce(0, Integer::sum);
        System.out.println("reduce : " + reduce);

        Integer reduce1 = Stream.of(1, 2, 3).reduce(3, Integer::sum);
        System.out.println("reduce : " + reduce1);

        Integer reduce2 = Stream.of(1, 2, 3).reduce(0, (x, y) -> x + y);
        System.out.println("reduce : " + reduce2);

        Integer reduce3 = Stream.of(1, 2, 3).reduce(3, (x, y) -> x + y);
        System.out.println("reduce : " + reduce3);

        Integer reduce4 = Stream.of(3, 3, 3).reduce(1, (x, y) -> x * y);
        System.out.println("reduce : " + reduce4);

        Integer reduce5 = Stream.of(3, 3, 3).reduce(0, (x, y) -> x * y);
        System.out.println("reduce : " + reduce5);

        Optional<Integer> reduce6 = Stream.of(1, 2, 3).reduce(Integer::sum);
        System.out.println("reduce : " + reduce6);

        Optional<Integer> reduce7 = Stream.of(1, 2, 3).reduce(Integer::max);
        System.out.println("reduce : " + reduce7);

        Optional<Integer> reduce8 = Stream.of(1, 2, 3).reduce(Integer::min);
        System.out.println("reduce : " + reduce8);

        String[] strArray
                = new String[]{"한국", "한국", "대한민국", "미국", "미합중국", "중국", "중화민국"};
        Set<String> collect = Stream.of(strArray).collect(Collectors.toSet());
        System.out.println(collect);

        List<String> collect1 = Stream.of(strArray).collect(Collectors.toList());
        System.out.println(collect1);

    }
    
}
