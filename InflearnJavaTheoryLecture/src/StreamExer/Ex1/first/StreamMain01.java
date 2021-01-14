package StreamExer.Ex1.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain01 {

    public static void main(String[] args) {

        List<String> strList01 = new ArrayList<>();
        strList01.add("반도체");
        strList01.add("가전제품");
        strList01.add("휴대폰");
        strList01.add("자동차");
        strList01.add("배");

        /**
         * Stream을 이용한 정렬
         */
        strList01.stream().sorted().forEach(i -> System.out.print(i + " "));

        String[] strArray = new String[]{"Alpha", "Bravo", "Charlie", "Delta"};

        /**
         * 배열을 스트림으로 변환하여 사용하는 방법입니다.
         */
        List<String> cvtStrList = Arrays.asList(strArray);
        cvtStrList.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> cvtStream01 = Arrays.stream(strArray);
        cvtStream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 특정 길이만큼 잘라서 사용하는 방법입니다.
         */

        Stream<String> cvtStream02 = Arrays.stream(strArray, 2, 3);
        cvtStream02.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> cvtStream03 = Stream.of(strArray);
        cvtStream03.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 스트림을 직접 만들어서 사용하는 방법입니다.
         */

        Stream<String> streamCompany = Stream.of("Samsung", "LG", "Hyundai", "SK");
        streamCompany.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> streamCountry = Stream.of("Korea", "America", "Japan", "China", "Russia");
        streamCountry.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * Int 타입의 스트림을 사용하는 방법입니다.
         */

        IntStream intStream01 = IntStream.range(1, 7);
        intStream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

        IntStream intStream02 = IntStream.rangeClosed(1, 7);
        intStream02.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 랜덤하게 값을 만들어서 IntStream으로 담아 사용하는 방법입니다.
         */

        IntStream intsRandom01 = new Random().ints();
        intsRandom01.limit(5).forEach(i -> System.out.print(i + " "));
        System.out.println();

        IntStream intsRandom02 = new Random().ints(3);
        intsRandom02.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 랜덤값이긴 한데 이번엔 double 타입의 스트림에 담아서 사용합니다.
         */

        DoubleStream doublesRandom01 = new Random().doubles();
        doublesRandom01.limit(2).forEach(i -> System.out.print(i + " "));
        System.out.println();

        DoubleStream doublesRandom02 = new Random().doubles(5);
        doublesRandom02.forEach(i -> System.out.print(i + " "));
        System.out.println();

        DoubleStream doubleStream01 = DoubleStream.of(0.1, 0.2, 0.3, 0.4, 0.5);
        doubleStream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * double 배열을 스트림으로 만들어서 사용하는 방법입니다.
         */

        Double[] arrayDouble = new Double[]{0.31, 0.32, 0.33, 0.34};
        Stream<Double> doubleStream02 = Arrays.stream(arrayDouble);
        doubleStream02.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 문자열을 자동 생성하여 스트림에 담아서 사용하는 방법입니다.
         */

        Stream<String> generateString01 = Stream.generate(() -> "Good company is best solution.");
        generateString01.limit(3).forEach(i -> System.out.print(i + " "));
        System.out.println();

        generateString01 = Stream.generate(() -> "Good company is best solution.");
        generateString01.limit(1).forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * 매스랜덤을 사용하여 랜덤값을 생성해서 스트림에 사용하는 형태입니다.
         */

        Stream<Double> generateMathRandom01 = Stream.generate(() -> Math.random() * 10);
        generateMathRandom01.limit(3).forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Double> generateAnotherMathRandom = Stream.generate(Math::random);
        generateAnotherMathRandom.limit(3).forEach(i -> System.out.print(i + " "));
        System.out.println();

        /**
         * iterate를 사용하여 값을 계산하여 담는 방식입니다.
         */

        Stream<Integer> iterateStream01 = Stream.iterate(1, i -> i + 3);
        iterateStream01.limit(5).forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Double> iterateStream02 = Stream.iterate(1.0, i -> i - 0.2);
        iterateStream02.limit(5).forEach(i -> System.out.print(i + " "));
        System.out.println();

    }

}
