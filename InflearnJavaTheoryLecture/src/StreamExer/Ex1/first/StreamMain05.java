package StreamExer.Ex1.first;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain05 {

    public static void main(String[] args) {

        /**
         * 원하는 값으로 바꾸거나 계산하는 등의 변환 작업을 하는 map 입니다.
         */
        Stream<Integer> mapStream01 = Stream.of(3, 4, 5).map(i -> i + 1);
        mapStream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Boolean> mapStream02 = Stream.of(3, 4, 5).map(i -> i < 5);
        mapStream02.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Boolean> mapStream03
                = Stream.of("samsung", "lg", "hyundai", "sk").map(s -> !s.equals("sk"));
        mapStream03.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> mapStream04 = Stream.of("samsung", "lg", "hyundai", "sk").map(s -> s.concat(" company"));
        mapStream04.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 다차원 배열을 스트림의 파라미터로 넣어서 하나의 스트림으로 변환하는 flatMap입니다.
         */

        String[][] multipleStringArray
                = new String[][]{{"a", "b", "c"}, {"가", "나", "다"}, {"good", "nice", "well"}};
        Stream<String> flatMapStream01 = Stream.of(multipleStringArray).flatMap(arr -> Arrays.stream(arr));
        flatMapStream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 두 개의 스트림을 하나의 스트림으로 합치는 concat입니다.
         */
        Stream<String> concatStrema01 = Stream.of("samsung", "lg");
        Stream<String> concatStream02 = Stream.of("반도체", "가전", "휴대폰", "자동자 전자장비");
        Stream<String> concatResultStream = Stream.concat(concatStrema01, concatStream02);
        concatResultStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> multipleMethodStream01
                = Stream.of("Samsung", "LG", "", "SK", "Hyundai", "Hyundai", "Hyundai")
                        .distinct()
                        .filter(s -> !s.isEmpty())
                        .sorted((s1, s2) -> s1.compareTo(s2));
        multipleMethodStream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

    }

}
