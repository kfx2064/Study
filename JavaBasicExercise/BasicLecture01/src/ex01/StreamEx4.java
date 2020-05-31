package ex01;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx4 {

    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    public static void ex2() {
        Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1")
                                    , new File("Ex1.bak"), new File("Ex2.java")
                                    , new File("Ex1.txt"));
        Stream<String> filenameStream = fileStream.map(File::getName)
                                                    .filter(s -> s.indexOf('.') != -1)
                                                    .map(s -> s.substring(s.indexOf('.') + 1))
                                                    .peek(s -> System.out.printf("filename=%s%n", s))
                                                    .map(String::toUpperCase)
                                                    .distinct();

        filenameStream.forEach(System.out::println);
    }

    public static void ex1() {
        String[] arrStr1 = new String[]{"b", "a", "d", "c", "e"};
        Stream<String> strStream = Stream.of(arrStr1);

        strStream.sorted().forEach(System.out::println);
    }

}
