package StreamExer.Ex1.first;

import java.util.stream.Stream;

public class StreamMain02 {

    public static void main(String[] args) {

        // 공백 제거하고 l로 시작하는 것 제거.

        Stream<String> originalStream01
                = Stream.of("samsung", "lg", "hyundai", "sk", "", "lotte");

        originalStream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> originalStream02
                = Stream.of("samsung", "lg", "hyundai", "sk", "", "lotte").filter(i -> !i.isEmpty()).filter(i -> !i.startsWith("l"));

        originalStream02.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 중복 제거.

        String[] strArray01 = new String[]{"Language", "Math", "Science", "Math", "Science"};
        Stream<String> strStreamOriginal = Stream.of(strArray01);
        strStreamOriginal.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> strStreamDistinct = Stream.of(strArray01).distinct();
        strStreamDistinct.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 정렬
        Stream<Integer> intStreamOriginal = Stream.of(3, 9, 1, 2, 4);
        intStreamOriginal.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Integer> intStreamSorted = Stream.of(3, 9, 1, 2, 4).sorted();
        intStreamSorted.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 문자열 스트림을 직접 만들고, 또 만들어진 스트림을 정렬하는 방법입니다.
         */
        Stream<String> stringStreamOriginal = Stream.of("다", "가", "라", "차", "아");
        stringStreamOriginal.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> stringStreamSorted = Stream.of("다", "가", "라", "차", "아").sorted();
        stringStreamSorted.forEach(i -> System.out.print(i + " "));
        System.out.println();

    }

}
