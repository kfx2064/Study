package lec10.Optional.ex02;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalMain02 {

    public static void main(String[] args) {

        /**
         * 필터 조건에 맞는 값이 존재하면 Optional 객체를 반환한다.
         * 만약 존재하지 않는다면 empty를 반환한다.
         */

        //String testText = String.valueOf("good");
        String testText = String.valueOf("bad");

        Optional<String> s1 = Optional.of(testText).filter(s -> {
            if (s.equals("good")) {
                System.out.println("good이 맞습니다.");
                return true;
            } else {
                System.out.println("bad입니다.");
                return false;
            }
        });

        System.out.println("good이 맞는가 : " + s1);

        String good = Optional.of(testText).filter(s -> {
            if (s.equals("good")) {
                System.out.println("good이 맞습니다.");
                return true;
            } else {
                System.out.println("bad입니다.");
                return false;
            }
        }).orElseGet(() -> {
            System.out.println("데이터가 존재하지 않아 수행합니다.");
            return "bad";
        });

        System.out.println("orElseGet을 추가합니다.");
        System.out.println("good이 맞는가 : " + good);

        /**
         * 필터를 이런 식으로도 사용이 가능합니다.
         * 제조공정에서 양품의 수치가 10미만이고
         * 불량의 수치가 10 이상이라고 가정합시다.
         *
         * 로직을 수행하여 해당 결과값을 확인합니다.
         */

        int validDataRange = 10;
        int successRatio = 3;
        int failRatio = 12;

        boolean rtnValid1 = Optional.of(successRatio).filter(i -> i < validDataRange).isPresent();
        boolean rtnValid2 = Optional.of(failRatio).filter(i -> i < validDataRange).isPresent();

        System.out.println("정상인가 : " + rtnValid1);
        System.out.println("정상인가 : " + rtnValid2);

    }

}
