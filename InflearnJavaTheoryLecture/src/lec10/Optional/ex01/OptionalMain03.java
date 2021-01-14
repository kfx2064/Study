package lec10.Optional.ex01;

import java.util.Optional;

public class OptionalMain03 {

    public static void main(String[] args) {

        /**
         * orElse는 Optional에 값이 없을 때 orElse에 기본값을 셋팅해 주는 기능입니다.
         */

        String s = Optional.ofNullable("Resort").orElse("Food");
        System.out.println("orElse : " + s);

        Object bed = Optional.ofNullable(null).orElse("Bed");
        System.out.println("orElse : " + bed);

        /**
         * orElseGet도 존재합니다.
         * orElseGet도 마찬가지로 데이터가 없을 때 생생하는 로직입니다.
         * 하지만 다른 점은 orElse는 무조건 실행한다는 것,
         * orElseGet은 앞에서 옵셔널에 값이 있을 경우엔 실행하지 않는다는 것입니다.
         *
         * 윈도우 응용프로그램을 만들 때는 크게 문제가 없겠지만
         * 웹 프로그래밍 등을 할 경우
         * 발생하는 서버 자원 소모 등을 생각하면
         * orElseGet이 더 유리합니다.
         */

        String good = Optional.ofNullable("good").orElseGet(() -> "nice");
        System.out.println("orElseGet : " + good);

        Object o = Optional.ofNullable(null).orElseGet(() -> "nice");
        System.out.println("orElseGet : " + o);

        /**
         * 이번엔 앞서 배웠던 orElse와 orElseGet에 대해서 차이점을 살펴보는
         * 로직을 짜도록 하겠습니다.
         *
         * 먼저 showMsg 메서드를 만들어 주세요.
         */
        System.out.println("showMsg를 사용하여 orElse와 orElseGet의 차이를 보겠습니다.");
        new OptionalMain03().doElseMethod();

    }

    public String showMsg() {
        System.out.println("Running fast, rest easy.");
        return "Last Mile.";
    }

    public void doElseMethod() {

        Object o = Optional.ofNullable(null).orElseGet(() -> showMsg());
        System.out.println("method : " + o);

        Object o1 = Optional.ofNullable(null).orElse(showMsg());
        System.out.println("method : " + o1);

        System.out.println("==============================");

        System.out.println("orElseGet");
        String good = Optional.ofNullable("good").orElseGet(this::showMsg);

        System.out.println("orElse");
        String good1 = Optional.ofNullable("good").orElse(showMsg());

        System.out.println("method : " + good);
        System.out.println("method : " + good1);

        /**
         * 보시면 아시겠지만 orElse의 경우 ofNullable에서 데이터가 들어가 있는데도
         * orElse를 실행합니다.
         * 그것을 알 수 있는 것은 showMsg() 메서드의 기능들이 동작하는 것을
         * 봤기 때문에 확인할 수 있는 것입니다.
         */

    }

}
