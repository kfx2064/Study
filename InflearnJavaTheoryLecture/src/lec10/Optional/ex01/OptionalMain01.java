package lec10.Optional.ex01;

import java.util.Optional;

public class OptionalMain01 {

    public static void main(String[] args) {

        /**
         * 옵셔널 오브와 엠프티에 대해 설명합니다.
         *
         * 만약 of가 null이 들어갈 때는 에러가 발생하는데
         * 그건 마지막에 실습하겠습니다.
         */

        Optional<String> good = Optional.of("good");
        String s = good.get();
        System.out.println("옵셔널 값 : " + s);

        String nice = Optional.of("nice").get();
        System.out.println("옵셔널 값 : " + nice);

        Optional<Object> empty = Optional.empty();
        System.out.println("empty : " + empty);

        Optional<String> korea = Optional.ofNullable("korea");
        String s1 = korea.get();
        System.out.println("옵셔널 값 : " + korea);
        System.out.println("옵셔널 값 : " + s1);

        String america = Optional.ofNullable("america").get();
        System.out.println("옵셔널 값 : " + america);

        Optional<Object> o = Optional.ofNullable(null);
        System.out.println("옵셔널 값 : " + o);

        /**
         * of는 null이 주입될 경우 에러가 발생합니다.
         * 이에 대비해서 만들어진 것이 ofNullable입니다.
         * null이 주입될 가능성이 있는 로직에선 ofNullable을 사용하고
         * null이 주입될 가능성이 없는 로직에선
         * of을 사용해도 좋습니다.
         */

        Optional<Object> o1 = Optional.of(null);
        System.out.println(o1);

    }

}
