package ex01;

import java.util.Optional;

public class OptionalEx1 {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }

    public static void ex4() {
        Optional<String> optStr = Optional.of(String.valueOf("abc"));
        boolean present = optStr.isPresent();
        System.out.println("present : " + present);

        optStr = Optional.empty();
        boolean present1 = optStr.isPresent();
        System.out.println("present1 : " + present1);
    }

    public static void ex3() {
        Optional<String> optAbc = Optional.of("abc");
        String s = optAbc.get();
        System.out.println("s : " + s);

        String none = optAbc.orElse("none");
        System.out.println("none : " + none);

        optAbc = Optional.empty();
        String empty = optAbc.orElse("empty");
        System.out.println("empty : " + empty);

        String s1 = optAbc.get();
        System.out.println("s1 : " + s1);
    }

    public static void ex2() {
        Optional<String> isNull = Optional.ofNullable(null);
        System.out.println(isNull);
        Optional<String> isNull2 = Optional.of(null);
        System.out.println(isNull2);
    }

    public static void ex1() {
        String str = String.valueOf("abc");
        Optional<String> optVal1 = Optional.of(str);
        optVal1.stream().forEach(System.out::println);
    }

}
