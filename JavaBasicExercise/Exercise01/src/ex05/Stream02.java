package ex05;

import java.util.List;
import java.util.stream.Stream;

public class Stream02 {

    public static void main(String[] args) {

        Stream<String> streamEmpty = Stream.empty();
        System.out.println("streamEmpty : " + streamEmpty);

        Stream<String> nullStringStream = streamOf(null);
        System.out.println("nullStringStream : " + nullStringStream);

        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        System.out.println("streamOfArray : " + streamOfArray);
        streamOfArray.forEach(s -> {
            System.out.println(s);
        });
    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

}
