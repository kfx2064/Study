package lec10.Optional.ex02;

import java.util.Optional;

public class OptionalMain03 {

    public static void main(String[] args) {

        /**
         * Optional에서 map에 대해 실습해 보겠습니다.
         * map은 Optional의 값을 map 내부의 로직을 통해
         * 변경해 주는 것입니다.
         */

        String originalString = "  good  ";

        System.out.println("문자열 길이 : " + originalString.length());

        String s1 = Optional.ofNullable(originalString)
                            .map(s -> s.trim())
                            .orElseGet(() -> {
                                return "not good";
                            });

        System.out.println("문자열 길이 : " + s1.length());

        System.out.println("===================================");

        int validData = 10;

        Integer integer = Optional.ofNullable(validData)
                                    .map(i -> i + 1)
                                    .orElseGet(() -> {
                                        return 0;
                                    });
        System.out.println("계산된 데이터 : " + integer);

        System.out.println("===================================");
        
        int intInputData = 15;

        Optional<Boolean> calcValidBoolean = Optional.ofNullable(intInputData)
                                                        .map(i -> {
                                                            if (i < 10) {
                                                                return true;
                                                            } else {
                                                                return false;
                                                            }
                                                        });

        System.out.println("검증된 값 : " + calcValidBoolean.get());

        System.out.println("===================================");

        /**
         * ifPresent에 대해 실습해 보겠습니다.
         */

    }

}
