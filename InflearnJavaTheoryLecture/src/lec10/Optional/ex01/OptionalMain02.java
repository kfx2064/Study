package lec10.Optional.ex01;

import java.util.Optional;

public class OptionalMain02 {

    public static void main(String[] args) {

        String korea = Optional.of("Korea").get();
        System.out.println("옵셔널 값 : " + korea);

        /**
         * 옵셔널에 대해 간단하게 테스트했습니다.
         * 이제 다른 것들을 해보겠습니다.
         */

        boolean good = Optional.ofNullable("good").isPresent();
        System.out.println("존재하는가 : " + good);

        boolean present = Optional.ofNullable(null).isPresent();
        System.out.println("존재하는가 : " + present);

        boolean america = Optional.ofNullable("America").isEmpty();
        System.out.println("비어있는가 : " + america);

        boolean empty = Optional.ofNullable(null).isEmpty();
        System.out.println("비어있는가 : " + empty);

    }

}
