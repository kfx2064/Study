package exer01.j;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        String[] strArray = {"Korea", "America", "Japan", "China", "Russia", "France", "English", "Germany", "Italy"};

        Stream<String> strStream01 =
                Arrays.asList(strArray).stream().sorted().map(s -> s.concat("##"));

        strStream01.forEach(i -> System.out.print(i + "  "));

    }

}
